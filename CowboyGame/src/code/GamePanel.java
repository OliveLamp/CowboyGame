package code;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	static Player p = Player.getInstance();
    static GameObj box = new GameObj(50,50);
    static int mX;
    static int mY;
    private static Image pSprite;
    static ArrayList<GameObj> levelData = new ArrayList<GameObj>();
	public void paintComponent(Graphics g){
	    clear(g);
	    render(g);
	}
	public static void clear(Graphics g){
		g.setColor(Color.black);
	    g.fillRect(0, 0, 500, 500);    
	}
	public void render(Graphics g){
	    g.setColor(Color.white);
	    g.fillRect(p.getX(), p.getY(), 50, 50);
	    for(int i = 0; i < levelData.size(); i++) {
	    	g.fillRect(levelData.get(i).getX(), levelData.get(i).getY(), 50, 50);
	     }
	    g.setColor(Color.red);
	    g.drawLine(p.getX()+25, p.getY()+25, mX, mY);
	    }
	public GamePanel() {
		setBounds(0,0,500,500);
    	setVisible(true);
    	levelData.add(box);
    	levelData.add(new GameObj(150,150));
	}
	
}

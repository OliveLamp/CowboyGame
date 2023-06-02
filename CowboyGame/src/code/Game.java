package code;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Game extends JFrame implements KeyListener{
	private  TimerTask run;
    private Timer timer;
    private static Player p = Player.getInstance();
    private static GameObj box = new GameObj(50,50);
    private static Toolkit t=Toolkit.getDefaultToolkit();
    private static Image pSprite;
    //kill me 3.0
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
        g.fillRect(box.getX(), box.getY(), 50, 50);
        g.drawImage(pSprite, p.getX(), p.getY(), this);
    }
    public Game(){
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	pack();
    	setVisible(true);
    	setBounds(0,0,500,500);
    	addKeyListener(this);
    	setResizable(false);
    	pSprite = t.getImage("/player.png");
        run = new TimerTask() {

            @Override
            public void run() {
            	//System.out.print("coconut.jpg");
            	repaint();
            	if(box.getHitBox().intersects(p.getHitBox())) {
            		System.out.println("penis");
            	}
            }
            
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(run, 0, 17);
       
        
    }
    
    @Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		p.update(e);
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		p.setSpeedX(0);
		p.setSpeedY(0);
	}
}

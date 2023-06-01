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
    //kill me 3.0
    public void paint(Graphics g){
    	clear(g);
    	render(g);
    }
    public static void clear(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0, 0, 500, 500);
        
    }
    public static void render(Graphics g){
    	g.setColor(Color.white);
        g.fillRect(p.getX(), p.getY(), 50, 50);
        g.fillRect(box.getX(), box.getY(), 50, 50);
    }
    public Game(){
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	pack();
    	setVisible(true);
    	setBounds(0,0,500,500);
    	addKeyListener(this);
    	setResizable(false);
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
        timer.scheduleAtFixedRate(run, 10, 100);
       
        
    }
    
    @Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W) {
			p.setY(p.getY()-5);
		}else if(e.getKeyCode() == KeyEvent.VK_S) {
			p.setY(p.getY()+5);
		}else if(e.getKeyCode() == KeyEvent.VK_A) {
			p.setX(p.getX()-5);
		}else if(e.getKeyCode() == KeyEvent.VK_D) {
			p.setX(p.getX()+5);
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
}

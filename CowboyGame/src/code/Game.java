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
    
    private static Toolkit t=Toolkit.getDefaultToolkit();
    private static GamePanel g = new GamePanel();
    //kill me 3.0
    
   
    public Game(){
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	pack();
    	setVisible(true);
    	setBounds(0,0,500,500);
    	addKeyListener(this);
    	setResizable(false);
    	add(g);
    	
        run = new TimerTask() {

            @Override
            public void run() {
            	//System.out.print("coconut.jpg");
            	g.repaint();
            	for(int i = 0; i<g.levelData.size(); i++) {
            		if(g.p.getHitBox().intersects(g.levelData.get(i).getHitBox())) {
            			g.p.setX((-1*g.p.getSpeedX())+g.p.getX());
            			g.p.setY((-1*g.p.getSpeedY())+g.p.getY());
            		}
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
		g.p.update(e);
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S) {
			g.p.setSpeedY(0);
		}
		if(e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_D) {
			g.p.setSpeedX(0);
		}
		
	}
}

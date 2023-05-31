package code;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import javax.swing.*;

public class Game {
	private  TimerTask run;
    private Timer timer;
   // private Player p = Player.getInstance();

    public void paint(Graphics g){
        
        clear(g);
        render(g);
    }
    public static void clear(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Constants.scrnWidth, Constants.scrnHeight);
        
    }
    public static void render(Graphics g){
       
    }
    public Game(){
        
        run = new TimerTask() {

            @Override
            public void run() {
                test[0].y+=5;
                repaint();
            }
            
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(run, 10, 100);
       
        
    }
    

    public static void main(String[] args) {
        JFrame f = new JFrame("game", null);
        f.setBounds(0,0,Constants.scrnWidth,Constants.scrnHeight);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        Game v = new Game();
        f.add(v);
    }
}

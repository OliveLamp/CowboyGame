package code;

import java.awt.event.KeyEvent;

public class Player extends GameObj{
	public Player(int inX, int inY) {
		super(inX, inY);
		// TODO Auto-generated constructor stub
	}
	public static Player mInstance = null;
	
	public static Player getInstance() {
		if(mInstance == null) {
			mInstance=new Player(250,250);
		}
		return mInstance;
	}
	
	public void update(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W) {
			setY(getY()-5);
		}else if(e.getKeyCode() == KeyEvent.VK_S) {
			setY(getY()+5);
		}else if(e.getKeyCode() == KeyEvent.VK_A) {
			setX(getX()-5);
		}else if(e.getKeyCode() == KeyEvent.VK_D) {
			setX(getX()+5);
		}
	}
}

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
			setSpeedY(getSpeedY()-1);
		}else if(e.getKeyCode() == KeyEvent.VK_S) {
			setSpeedY(getSpeedY()+1);
		}else if(e.getKeyCode() == KeyEvent.VK_A) {
			setSpeedX(getSpeedX()-1);
		}else if(e.getKeyCode() == KeyEvent.VK_D) {
			setSpeedX(getSpeedY()+1);
		}
		setX(getX()+getSpeedX());
		setY(getY()+getSpeedY());
	}
}

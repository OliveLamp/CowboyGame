package code;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class GameObj {
	private int x;
	private int y;
	private int speedX;
	private int speedY;
	private Rectangle hitbox;
	public GameObj(int inX, int inY) {
		this.x = inX;
		this.y = inY;
		this.speedX = 0;
		this.speedY = 0;
		hitbox = new Rectangle(x,y,50,50);
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void setX(int in) {
		this.x=in;
		this.hitbox.x=this.x;
	}
	public void setY(int in) {
		this.y=in;
		this.hitbox.y=this.y;
	}
	public Rectangle getHitBox() {
		return this.hitbox;
	}
	public int getSpeedX() {
		return speedX;
	}
	public int getSpeedY() {
		return speedY;
	}
	public void setSpeedX(int in) {
		speedX = in;
	}
	public void setSpeedY(int in) {
		speedY = in;
	}
	
}

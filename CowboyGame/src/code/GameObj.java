package code;

import java.awt.Rectangle;

public class GameObj {
	private int x;
	private int y;
	private Rectangle hitbox;
	public GameObj(int inX, int inY) {
		this.x = inX;
		this.y = inY;
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
	
	
}

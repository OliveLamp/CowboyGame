package code;

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
}

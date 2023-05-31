package code;

public class Player {
	public static Player mInstance = null;
	public static Player getInstance() {
		if(mInstance == null) {
			mInstance=new Player();
		}
		return mInstance;
	}
}

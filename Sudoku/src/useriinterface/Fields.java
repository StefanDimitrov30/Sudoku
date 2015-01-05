package useriinterface;

import java.lang.reflect.Field;

public class Fields {
	private int x;
	private int y;
	

	public Fields(int x, int y) {

		this.x = x;
		this.y = y;
		
	}

	protected int getX() {
		return x;
	}

	protected void setX(int x) {
		this.x = x;
	}

	protected int getY() {
		return y;
	}

	protected void setY(int y) {
		this.y = y;
	}

}

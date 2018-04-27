package data_structures;

public class Snake {
	int viciousness;
	boolean venomous;

	Snake(int viciousness1, boolean venomous1) {
		viciousness = viciousness1;
		venomous = venomous1;
	}

	public int getViciousness() {
		return viciousness;
	}

	public void setViciousness(int viciousness) {
		this.viciousness = viciousness;
	}

	public boolean isVenomous() {
		return venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}

}

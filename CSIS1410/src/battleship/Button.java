package battleship;

/**
 * 
 * @author skyler
 *
 *Constructor for buttons to store hit and attempted
 */

public class Button {
	
	private boolean isHit;
	private boolean isTried;
	
	public Button(boolean isHit, boolean isTried) {
		this.isHit = isHit;
		this.isTried = isTried;
	}
	
	public boolean isHit() {
		return isHit;
	}
	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}
	public boolean isTried() {
		return isTried;
	}
	public void setTried(boolean isTried) {
		this.isTried = isTried;
	}


}

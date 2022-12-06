package battleship;

/**
 * 
 * @author skyler
 *
 *Constructor for buttons to store hit and attempted
 */

public class Button {
	
	private boolean isShip;
	private boolean isTried;
	
	public Button(boolean isHit, boolean isTried) {
		this.isShip = isHit;
		this.isTried = isTried;
	}
	
	public boolean isShip() {
		return isShip;
	}
	public void setShip(boolean isHit) {
		this.isShip = isHit;
	}
	public boolean isTried() {
		return isTried;
	}
	public void setTried(boolean isTried) {
		this.isTried = isTried;
	}

	@Override
	public String toString() {
		String btn = " ";
		if (isShip && isTried)
			btn = "x";
		else if(!isShip && isTried)
			btn = "O";
		else if (!isTried)
			btn = "=";
		return btn;
	}
	
	


}

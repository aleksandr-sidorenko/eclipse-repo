package battleship;

public class Board {
	
	Button HitMiss[][];
	
	/**
	 * a method to populate the board with buttons
	 */
	public void Populate() {
		for(int i = 0; i < 10 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				HitMiss[i][j] = new Button(false, false);
			}
		}
	}
	
	public void PlaceShip(int shipSize, boolean verticle, int x, int y) {
		for(int i=0;i<shipSize;i++) {
			if (verticle == true)
				HitMiss[x][y+i].setShip(true);
			else
				HitMiss[x+i][y].setShip(true);
		}
	}
	
	public String attack(int x, int y) {
		String retn = "";
		if (!HitMiss[x][y].isTried())
			retn = "Location already Tried";
		else if (HitMiss[x][y].isShip())
			retn = "You Hit";
		else if (!HitMiss[x][y].isShip())
			retn = "you missed";
		else
			retn = "an error has occured";
		HitMiss[x][y].setTried(true);
		return retn;
	}

}

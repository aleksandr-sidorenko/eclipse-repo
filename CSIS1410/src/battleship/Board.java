package battleship;

public class Board {
	
	private static Button HitMiss[][] = new Button[10][10];
	
	
	
	public static String PrintBoard() {
		String board ="\n";
		
		for(int i = 0; i < 10 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				board = board + HitMiss[i][j].toString();
			}
			board= board+"\n";
		}
		
		return board;
	}
	/**
	 * a method to populate the board with buttons
	 */
	public static void Populate() {
		for(int i = 0; i < 10 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				HitMiss[i][j] = new Button(false, false);
			}
		}
	}
	
	public boolean LocationAvailable(int ShipSize, boolean verticle, int x, int y) {
		for(int i=0;i<ShipSize;i++) {
			if (i+x>9 || i+y>9)
				return false;
			if (verticle == true)
				if (HitMiss[x][y+i].isShip())
					return false;
			else
				if(HitMiss[x+i][y].isShip())
					return false;
		}
		return true;
	}
	
	
	public void PlaceShip(int shipSize, boolean verticle, int x, int y) {
		for(int i=0;i<shipSize;i++) {
			if (verticle == true)
				HitMiss[x][y+i].setShip(true);
			else
				HitMiss[x+i][y].setShip(true);
		}
	}
	
	public boolean attack(int x, int y) {
		boolean retn;
		if (!HitMiss[x][y].isTried())
			retn = (Boolean) null;
		else if (HitMiss[x][y].isShip())
			retn = true;
		else if (!HitMiss[x][y].isShip())
			retn = false;
		else
			retn = (Boolean) null;
		HitMiss[x][y].setTried(true);
		return retn;
	}

}

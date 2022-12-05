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

}

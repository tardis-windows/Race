// Tamara Pando
// Assignment 2 (TesterClass.java and RaceClass.java)

/* RaceClass.java 
 * This Method handles the locations of a player during the race
 * and defines the type of game mode (move percentage type) the player is allowed to move. 
 */
  

public class RaceClass {
	
// static member variable (same across all objects, states the title of the program) 
	private static String title = "Race Simulation Class"; 
	
	private int player_location; 

// non-default constructor initializes the players location at the start line. 
	public RaceClass() {	
			player_location = 1; 
	}
	
// Method overload toString to print the static variable
	public  String toString() {
		return title;
	}

// getters/setters methods for private variable for possible modification
	public void setPlayerLocation(int player_location) {
		this.player_location = player_location; 
	}
	
	public int getPlayerLocation() {
		return player_location; 
	}

// method that checks boundaries for negative location 
// if location < 0, will reset player_location = 1
	public void resetPlayer() {
		if(player_location < 1)
		player_location = 1; 
	}
	
	
// Method for moves arrangement for racer #1 as per assignment requirements
// takes in the random numbers generated in main and updates the players_location 
// accordingly 
	
	public void gameModeOne(int move) {
		
		switch(move) {		
		// jump 50% +3
		case 1: 
		case 2: 
		case 3: 
		case 4:
		case 5:
			player_location += 3; 
			resetPlayer(); 
			break; 	
		// slip %30 -6
		case 6: 
		case 7: 
		case 8: 
			player_location -= 6; 
			resetPlayer(); 
			break; 
		// walk 20% +1
		case 9: 
		case 10: 
			player_location += 1; 
			resetPlayer(); 
			break; 
		}
	}

	// Method for moves arrangement for racer #2 as per assignment requirements
	// works like previous method but with different arrangement 
	void gameModeTwo(int move) {
		
		switch(move) {
		// sleep 10% no moves 
		case 1:
			resetPlayer(); 
		// jump 20% 5 	
		case 2: 
		case 3: 
			player_location += 5; 
			resetPlayer(); 
			break;
		// small slip 20% -2
		case 4:
		case 5:
			player_location -= 2; 
			resetPlayer(); 
			break; 	
		// slip 10% 10	
		case 6: 
			player_location -= 10; 
			resetPlayer(); 
			break; 
		// walk 40% 1			
		case 7: 
		case 8: 
		case 9: 
		case 10: 
			player_location += 1; 
			resetPlayer(); 
			break; 
		}	
	}
	
}

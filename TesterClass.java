//  Tamara Pando 
//  Assignment 2 (TesterClass.java and RaceClass.java)
//  Csc 221
  
/* TesterClass.java 
 * This class is used to test the objects created from the RaceClass.java class.
 */
  
 import java.security.SecureRandom; // to be used for Random number 

public class TesterClass{
	
	/* 
	 * Static Method that checks if its a tie during the race 
	 */
	public static void testTie(int player1, int player2) {
		
		if(player1 == player2)
			System.out.printf("%37s%n", "IT'S A TIE!");	
	}
	
	/*
	 * Static Method that prints the winner of the race 
	 */
	public static void testWinner(int player1, int player2) {
		if(player1 > player2)
			System.out.printf("%n%n%40s", "RACER 1 WINS!!");
		else
			System.out.printf("%n%n%40s", "RACER 2 WINS!!");
	}
	
	/*
	 * Main method
	 */
	public static void main(String[]args) {
		
		SecureRandom rand = new SecureRandom(); // new instance for randomization
		
		// Two objects created as players for the race  
		RaceClass r1 = new RaceClass(); 
		RaceClass r2 = new RaceClass(); 
			
		System.out.println(r1.toString()); // Prints static variable from RaceClass
		
		int time_elapsed = 0; // Variable to keep time lapsed during race
		
		System.out.printf("%n%n%s%n%n",".................... READY.... SET.... GO!!"); 
		System.out.printf("%28s%15s%n", "Racer #1", "Racer #2"); 
		
        // While loop runs until one of the players reach the finish line at location 100 
		while((r1.getPlayerLocation() < 100) && (r2.getPlayerLocation() < 100)) {
			
			time_elapsed += 1; 
			
			// two instances of random integers from 1 - 10
			int rand_int1 = rand.nextInt(10) + 1; 
			int rand_int2 = rand.nextInt(10) + 1; 
		
			// methods to use different percentage of moves 
			r2.gameModeTwo(rand_int2);
			r1.gameModeOne(rand_int1);	
				
			// print the location of each player after one iteration
			System.out.printf("Location: %15d%15d%n", r1.getPlayerLocation(),r2.getPlayerLocation() );
			
			testTie(r1.getPlayerLocation(), r2.getPlayerLocation());
		}
		
		testWinner(r1.getPlayerLocation(), r2.getPlayerLocation()); 
		
		System.out.printf("%n%s%d%n", "Time elapsed: ", time_elapsed);
		
	}
}


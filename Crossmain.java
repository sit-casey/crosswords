package crossword;

//Imports features of Swing required for the program to run
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Intializes the game of crossword, asking the user to pick between two crosswords
 * and makes them visible at a set size.
 */
public class Crossmain {

	private static String[] word = {"Food","Animals"};  //String array holding the two options the user can pick
	public static void main(String[] args) {
		//Asks the user which crossword they'll pick, and stores the answer in an int
		int result = JOptionPane.showOptionDialog(null, "Which Crossword Puzzle would you like to attempt?", "Crossword Puzzles!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, word, word[0]);
			
		if(result==0){ //Checks if the user picked the first option
			Foodword obj = new Foodword(); //Initializes the food crossword puzzle
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets the program to shut down completely when prompted
			obj.setSize(1600,1600); //Sets the size of the window
			obj.setVisible(true);   //Makes the program visible
		}
		else if(result==1){ //Checks if the user picked the second option
			Animalsword obj = new Animalsword(); //Initializes the animal crossword puzzle
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Sets the program to shut down completely when prompted
			obj.setSize(1600,1600);  //Sets the size of the window
			obj.setVisible(true);    //Makes the program visible
		}
	}

}

import java.util.HashMap;
import java.util.Map;

/**
 * Problem is to write an algorithm to figure out if someOne has one the game of TicTacToe or not. 
 * NOTE Still incomplete implementation
 * 
 * @author pbhatnagar
 *
 */
public class TicTacToeBoardChecker {

	//the following functionality is there for the case if the hasWon() will be called alot of times
	Map<Integer, Boolean> resultMap;
	public TicTacToeBoardChecker(){
		resultMap = new HashMap<Integer, Boolean>();
	}
	//player number can just be the 1 or 2
	public void populateMap(int playerNumber){
		int factor = 1;
		
		
	}

}

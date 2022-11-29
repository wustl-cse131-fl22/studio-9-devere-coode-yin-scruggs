package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	private int height = 0;
	
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> coolMap = new HashMap<String,Integer>();
		coolMap.put("Jack", 75);
		coolMap.put("Colin", 71);
		coolMap.put("Emma", 64);
		String name = "";
		String currName = "";
		int corrHeight = 0;
		while (!name.equals("quit")) {
			System.out.print("Who's height are you looking for?");
			currName = in.next();
			if ((coolMap.getOrDefault(currName, 0)) == 0) {
				System.out.println("name doesn't exist");
			}
			else {
				corrHeight = coolMap.get(currName);
				System.out.println("height: " + corrHeight);
			}
		}
		System.out.print(coolMap);
		


	
	}
}

package Q3.ElevensLab.ActivityStarterCode.Activity2StarterCode;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = new String[2];
		String [] suits = new String[2];
		int[] values = new int[2];

		Deck one = new Deck(ranks, suits, values);
		System.out.println(one.toString());
		System.out.println(one.isEmpty());
		System.out.println(one.size());
		one.shuffle();
		System.out.println(one.deal());

		Deck two = new Deck(ranks, suits, values);
		System.out.println(two.toString());
		System.out.println(two.isEmpty());
		System.out.println(two.size());
		two.shuffle();
		System.out.println(two.deal());

		Deck three = new Deck(ranks, suits, values);
		System.out.println(three.toString());
		System.out.println(three.isEmpty());
		System.out.println(three.size());
		three.shuffle();
		System.out.println(three.deal());
	}
}

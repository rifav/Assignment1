/**
 * 
 */
package cse360assignment02;

/**
 * @author rifav
 * @version v1
 *
 * Class to test the code
 */
public class driver {

	/**
	 * Main method to test the code
	 * @param args
	 */
	public static void main(String[] args) {
		
		AddingMachine test = new AddingMachine();
		
		test.add(4);
		test.subtract(2);
		test.add(5);
		System.out.println(test.toString());
		System.out.println(test.getTotal());
		test.clear();
		System.out.println(test.toString());
		System.out.println(test.getTotal());

	}

}

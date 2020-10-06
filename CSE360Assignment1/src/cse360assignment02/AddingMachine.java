package cse360assignment02;

/**
 * Class that can add and subtract numbers to a sum and print a string of all operations
 *
 * @author rifav
 * @version v2
 */
public class AddingMachine {

  private int total; // integer variable that will contain the total sum
  private String memory; // string variable to contain all operations
  
  /**
   * Constructor for the class adding machine
   * Instantiates variable total which will contain the sum
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    memory = "0"; // necessary to make memory for all operations
  }
  
  /**
   * Method to return the total
   * 
   * @return  total sum
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Method to add the value in the parameter to the total sum
   *
   * @param value    the number to be added
   */
  public void add (int value) {
	  total = total + value;
	  memory = memory + " + " + Integer.toString(value);
  }

  /**
   * Method to subtract the value in the parameter from the total sum
   *
   *@param value	the number to be subtracted
   */
  public void subtract (int value) {
	  total = total - value;
	  memory = memory + " - " + Integer.toString(value);
  }

  /**
   * Method to return a string with all operations performed
   *
   *@return a string	string of all operations
   */
  public String toString () {
    return memory;
  }

  /**
   * Method to clear the string with all operations performed and sum
   */
  public void clear() {
	  memory = "0";
	  total = 0;
  }

}

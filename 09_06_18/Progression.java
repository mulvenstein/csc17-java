/**
 * A class for numeric progressions.
 */

public class Progression {
  // First value of the progression
  private long first;
  // Current value of the progression. 
  private long current;
  private long increment;

  /** Default constructor.  **/
  public Progression() {
    current = first = 0;
    increment = 1;
  }

  // Reset the progression value 
  private long firstValue() {
  current = first;
	  return current;
  }

  // Advances the progression to the next value.
  private long nextValue() {
    current += increment;
    return current; // default next value
  }


  // Prints the first n values of the progression.
  public void printProgression(int n) {
	  System.out.print(firstValue());
    for (int i = 2; i <= n; i++)
      System.out.print(" " + nextValue());
	  System.out.println(); // ends the line
  }
}
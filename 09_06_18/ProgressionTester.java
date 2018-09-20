/** Test program for the progression classes */
public class ProgressionTester {
  public static void main(String[] args) {
    // test Progression      
    System.out.println("Default progression");
    Progression prog = new Progression();
    prog.printProgression(10);

    // test ArithProgression
    System.out.println("Arithmetic progression with start value 2 and increment 5:");
    ArithProgression test1 = new ArithProgression(2, 5);
    test1.printArithmetic(10);
    System.out.println();
    
    // test FibonacciProgression
    System.out.println("Fibonacci progression with start values 4 and 6:");
    FibProgression test2 = new FibProgression(4, 6);
    test2.printProgression(10);

  }
}

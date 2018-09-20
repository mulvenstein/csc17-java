public class FibProgression{

  // starting numbers to be used in fib. sequence
  long m_start1;
  long m_start2;
  // temp value to store
  long m_temp;

  // default constructor
  public FibProgression(){
    // default starting vaules to be 1 and 1
    this.m_start1 = 1;
    this.m_start2 = 1;  
  }
  // parameter constructor with starting 2 numbers
  public FibProgression(long start1, long start2){
    // set starting numbers with ones provided
    this.m_start1 = start1;
    this.m_start2 = start2;
  }

  public void nextValue(){
    // temp value is the previous start2 value
    // next value is the previous 2 added together
    this.m_temp = this.m_start2;
    this.m_start2 = this.m_start1 + this.m_start2;  
    // set the start1 as the temp
    this.m_start1 = this.m_temp;
    // we now have the previous start2 set as new start1, and 
    //  the new start2 is the previous 2 starts added together
  }

  // print n numbers in prog
  public void printProgression(int n){
    // print first number
    System.out.print(this.m_start1);
    for(int i=0; i<n; i++){
      System.out.print(" " + this.m_start2 + " ");
      // get nexvalue
      this.nextValue();
    }
    System.out.println();
  }
  
}
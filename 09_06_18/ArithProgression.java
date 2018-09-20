public class ArithProgression {
  private long m_start; //starting variable
  private long m_increment; // incremental value

  // default constructor : 1 and 1
  ArithProgression(){
    this.m_start = 1;
    this.m_increment = 1;
  }

  // param constructor where users pass start  and increment
  ArithProgression(long start, long increment){
    this.m_increment = increment;
    this.m_start = start;
  }

  // print the start and increment n times
  public void printArithmetic(int n){
    System.out.print(this.m_start);
    for( int i = 0; i < n; ++i){
      this.m_start += this.m_increment;
      System.out.print(" " + this.m_start);
    }
  }
}
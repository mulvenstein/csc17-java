public class extFibProgression extends Progression{
    
    private long m_num1, m_num2;
    private long counter;

    /* default set 0,1 */
    public extFibProgression(){
        this.counter = 0;
        this.m_num1 = 0;
        this.m_num2 = 1;
    }

    /* param constructor */
    public extFibProgression(long num1, long num2){
        this.counter = 0;
        this.m_num1 = num1;
        this.m_num2 = num2;
        this.first = this.m_num1;
    }

    // print first 2 values
    // public long firstValue(){
    //     System.out.print(this.m_num1 + " " + this.m_num2);
    //     return this.m_num1;
    // }

    private long m_temp;
    public long nextValue(){
        if(this.counter == 0){
            System.out.print(" " + this.m_num2);
        }
        this.m_temp = this.m_num2;
        this.m_num2 += this.m_num1;
        this.m_num1 = this.m_temp;

        this.counter ++;

        return this.m_num2;
    }

}
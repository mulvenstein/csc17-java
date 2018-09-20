public class extArithProgression extends Progression{

    private long m_start, m_increment; 
    /* DEFAULT CONSTRUCTOR ASSIGNS 0 AND 1 AS DEFAULTS */
    public extArithProgression(){
        this.m_start = 0; //first is var from Progression.java
        this.m_increment = 1; // cur is var from Progression
    }

    /* PARAM CONSTRUCTOR TO PASS START AND INC. VALUES */
    public extArithProgression(long start, long inc){
        this.m_start = start;
        this.m_increment = inc;
        this.first = start;
    }

    public long nextValue(){
        this.cur += this.m_increment;
        return this.cur;
    }

}
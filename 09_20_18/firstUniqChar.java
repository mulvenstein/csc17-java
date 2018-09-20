class firstUniqChar {
    
    // char to find in string
    private char m_toFind;
    
    // constructor (default)
    firstUniqChar(){
        // basic object char to find will be 'a'
        this.set_toFind('a');
    }

    // param constructor 
    firstUniqChar(char c){
        this.set_toFind(c);
    }

    // accessor to char to find
    protected char get_toFind() {
        return this.m_toFind;
    }

    // mutator for char to find
    protected void set_toFind(char c){
        this.m_toFind = c;
    }

    // mutator to char to find

    public int SolutionFirstUniqChar(String s) {
        for(int i=0; i<s.length(); i++){
            if(this.get_toFind() == s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
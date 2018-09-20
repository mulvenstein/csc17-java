import java.util.HashMap;
import java.util.Map;

class firstUniqChar {
    
    // char to find in string
    private char m_toFind;
    public int lowest=999;

    public HashMap<Character, Integer> m_map = new HashMap<Character, Integer>();

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
        int index;
        lowest = 999;
        for(int i=0; i<s.length(); i++){
            // if(this.get_toFind() == s.charAt(i)){
            //     return i;
            // }
            if(m_map.containsKey(s.charAt(i))){
                // key exists, so it isnt unique. set val to -1
                m_map.computeIfPresent(s.charAt(i), (k, v) -> v = -1);
            } else {
                // place
                m_map.put(s.charAt(i), i);
            }
        }

        for (Map.Entry<Character, Integer> entry : m_map.entrySet()) {    
            char key = entry.getKey();
            Integer value = entry.getValue();
            //System.out.println(key + " " + value);
            if (lowest > value && value >= 0) {
                lowest = value;
                //System.out.println("lowest : " + lowest);
            }
        }
        this.m_map.clear();
        return lowest;
    }
    
}
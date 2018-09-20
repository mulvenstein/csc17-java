class reverseString {

    //constructor
    reverseString(){
        //System.out.println("new rs obj");
    }

    // pub char array to temp store string's char to reverse
    public char[] temp_arr;

    public String SolutionReverseString(String s) {
        // set lenth of temp arr to len of s
        temp_arr = new char[s.length()];
        int count = 0; // need a second counter from 0 -> end 
        for(int i=s.length()-1; i>0-1; i--){
            temp_arr[count] = s.charAt(i); //set first index of char arr to last of one we want to reverse
            count = count + 1;
        }
        // set string to look at starting addr of temp_arr instead of itself
        s = String.valueOf(temp_arr);
        return s; //returns reversed string 
    }        
}
class tester {

    public static void main(String[] args){
        System.out.println("Lab 3 driver\n");

        // test first Uniq Char
        System.out.println("---------------------------\ntesting first uniq char...\n");
        firstUniqChar test0 = new firstUniqChar('c');
        System.out.println("index " + 'c' + " in  : ilovehofstra " + test0.SolutionFirstUniqChar("ilovehofstra"));
        System.out.println("index " + 'c' + " in  : abracadabra " + test0.SolutionFirstUniqChar("abracadabra"));

        // test reverse string
        System.out.println("\n----------------------------\ntesting reverse string...\n");
        reverseString test1 = new reverseString();
        System.out.println(test1.SolutionReverseString("hello"));
        System.out.println(test1.SolutionReverseString("A man, a plan, a canal: Panama"));

    }

}
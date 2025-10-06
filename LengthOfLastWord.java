class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;  //to store the length of the whole string 
        int i = s.length() - 1;  //for indexing purpose
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;  //for getting the last character's last index position
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;  //to store the length of last word in the reverse order
            i--;
        }
        return length;
    }
    public static void main(String[] args){
      System.out.println(lengthOfLastWord("Hello World"));  //for hard-coded string
    }
}

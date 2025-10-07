public class FirstOccurenceOfString
{
	public static void main(String[] args) {
		System.out.println(strStr("abcabcabcd", "bcd"));    //haystack - "abcabcabcd" & needle - "bcd"
	}
	
	public static int strStr(String haystack, String needle) {  //made this prototype static to check the functioning without object creation

        if(needle.isEmpty())    //return the initial index if needle string does not contain anything
            return 0;

        int hLen = haystack.length();   //length of haystack string
        int nLen = needle.length(); //length of needle string

        if (hLen < nLen) //if the haystack has lesser length in comparison to needle
            return -1;

        for (int i = 0; i <= hLen - nLen; i++) {    //loop for controlling the haystack string
            int j = 0;
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {    //loop for controlling the needle string
                j++;    
            }
            if (j == nLen) return i;    //if the count of 'j' becomes equal to needle's length while matching the string part
        }        
        return -1;  //default return
    }
}

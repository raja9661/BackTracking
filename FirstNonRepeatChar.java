import java.util.*;
public class FirstNonRepeatChar {
        public static int FirstNonRepeat(String s) {
            int[] charCount = new int[26]; // Assuming only lowercase English letters
            char arr[]=s.toCharArray();
            // Count the frequency of each character
            for (char c : arr) {
                charCount[c - 'a']++;
            }
    
            // Find the first non-repeating character
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (charCount[c - 'a'] == 1) {
                    return i;
                }
            }
    
            return -1;
        }
    
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=scn.nextLine();
        System.out.println(FirstNonRepeat(str));
    }
}

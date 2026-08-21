import java.util.*;
public class FirstNonRepeatingCharacter {
    public static char firstNonRepeating(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) { ///        // Count frequency of each character
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        // Find the first non-repeating character
        for (int i = 0; i < str.length(); i++) { // iterate through string and find the first element whose frequency is one
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                return ch;
            }
        }  
        return '\0'; // No non-repeating character found
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char result = firstNonRepeating(str);
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First Non-Repeating Character = " + result);
        }
        sc.close();
    }
}
// if u want to return the index of first non repating/ unique chaarcter--->
/*import java.util.HashMap;

class Solution {

    public int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {

            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
} */
import java.util.*;
public class FrequencyOfCharacters {

    public static void frequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        str = str.toLowerCase();  //        // if u want u can convert the string to lower case or upper case to make it case insensitive
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1); // Increase frequency
            } else {
                map.put(ch, 1); // First occurrence
            }
        }
        for (char key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        frequency(str);
        sc.close();
    }
}
/*import java.util.Scanner;

public class FrequencyOfCharacters {

    public static void frequency(String str) {

        int[] freq = new int[26];

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                freq[ch - 'a']++; // Increase frequency
            }
        }

        for (int i = 0; i < 26; i++) {

            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " -> " + freq[i]);
            }
        }
    }
 */
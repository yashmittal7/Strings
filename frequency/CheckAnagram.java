import java.util.Arrays;
import java.util.Scanner;
public class CheckAnagram {
    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray(); 
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1); // Sort first string
        Arrays.sort(arr2); // Sort second string

        return Arrays.equals(arr1, arr2); 
        // Compare sorted arrays IF they are equal then they are anagrams long version of this is to use a loop to compare each character of the sorted arrays, like this: for (int i = 0; i < arr1.length; i++) { if (arr1[i] != arr2[i]) { return false; } } return true;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are Not Anagrams");
        }
        sc.close();
    }
}
// this takes time complexity of O(n log n) because of sorting the strings, where n is the length of the strings. The space complexity is O(n) for storing the character arrays..

/*most optimal--->
public class CheckAnagram {
    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {

            freq[str1.charAt(i) - 'a']++; // Increase count
            freq[str2.charAt(i) - 'a']--; // Decrease count
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    */

// alternative approach 0(N) hashmap-
/*import java.util.HashMap;
import java.util.Scanner;

public class CheckAnagram {

    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of first string
        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Reduce frequency using second string
        for (int i = 0; i < str2.length(); i++) {

            char ch = str2.charAt(i);

            // Character not found
            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            // Remove character if frequency becomes 0
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are Not Anagrams");
        }

        sc.close();
    }
} */

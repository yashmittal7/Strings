// isomorphic string 
/*Two strings are isomorphic if every character in the first string maps to exactly one character in the second string.

Also,

One character cannot map to two different characters.
Two different characters cannot map to the same character.


algorithmm-->

If lengths are different
    Return false

Create map1
Create map2

Traverse both strings

    If mapping already exists and doesn't match
        Return false

    Store both mappings

Return true*/
import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {

            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (map1.containsKey(ch1)) {

                if (map1.get(ch1) != ch2) {
                    return false;
                }

            } else {
                map1.put(ch1, ch2);
            }

            if (map2.containsKey(ch2)) {

                if (map2.get(ch2) != ch1) {
                    return false;
                }

            } else {
                map2.put(ch2, ch1);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isIsomorphic(str1, str2)) {
            System.out.println("Strings are Isomorphic");
        } else {
            System.out.println("Strings are Not Isomorphic");
        }

        sc.close();
    }
}

/*class Solution {
    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
} 
    ---------------------------------------------------------------------------
   
    class Solution {

    public boolean isIsomorphic(String s, String t) {

        int[] a = new int[256];
        int[] b = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (a[c1] != b[c2]) {
                return false;
            }

            a[c1] = i + 1;
            b[c2] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.isIsomorphic("egg", "add"));
    }
}

*/
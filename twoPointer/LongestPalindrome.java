import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestPalindrome {

    public static int longestPalindrome(String str) {

        Set<Character> set = new HashSet<>();

        int length = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (set.contains(ch)) {
                length += 2;
                set.remove(ch); // Pair formed
            } else {
                set.add(ch); // First occurrence
            }
        }
        // One odd character can be placed in the center
        if (!set.isEmpty()) {
            length++;
        }

        return length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Longest Palindrome Length = " + longestPalindrome(str));

        sc.close();
    }
}


/*class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int length = 0;
        boolean oddFound = false;

        for (int c : count) {
            length += (c / 2) * 2;
            if (c % 2 == 1) {
                oddFound = true;
            }
        }

        return oddFound ? length + 1 : length;
    }
} */
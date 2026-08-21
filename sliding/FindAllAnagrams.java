import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pattern = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pattern[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pattern, window)) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {

            window[s.charAt(i) - 'a']++;                   // Add new character
            window[s.charAt(i - p.length()) - 'a']--;      // Remove old character

            if (Arrays.equals(pattern, window)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine().toLowerCase();

        System.out.print("Enter pattern: ");
        String p = sc.nextLine().toLowerCase();

        System.out.println(findAnagrams(s, p));

        sc.close();
    }
}
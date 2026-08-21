import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String str) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            while (set.contains(str.charAt(right))) {

                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Longest Substring Length = " +
                lengthOfLongestSubstring(str));

        sc.close();
    }
}


/*bettter
import java.util.Scanner;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String str) {

        int[] charIndex = new int[128];

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            left = Math.max(left, charIndex[ch]);   // Jump left pointer if duplicate found

            charIndex[ch] = right + 1;              // Store next index of current character

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Longest Substring Length = " +
                lengthOfLongestSubstring(str));

        sc.close();
    }
} */
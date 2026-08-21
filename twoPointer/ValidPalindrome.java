import java.util.Scanner;
public class ValidPalindrome {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {

            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) { // left < right is added to avoid index out of bounds exception and check if the character at the left pointer is not a letter or digit, then move the left pointer to the right
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            char ch1 = Character.toLowerCase(str.charAt(left));
            char ch2 = Character.toLowerCase(str.charAt(right));

            if (ch1 != ch2) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}


/*Algorithm (Beginner Friendly) – Valid Palindrome (LeetCode 125)
Take two pointers:
start = 0 (first character)
end = length - 1 (last character)
Repeat while start < end:
If start points to a character that is not a letter or digit, move start one step forward.
If end points to a character that is not a letter or digit, move end one step backward.
Convert both characters to lowercase and compare them.
If they are not equal, return false.
Otherwise, move:
start++
end--
If the loop finishes without finding any mismatch, return true. */
import java.util.Scanner;
public class ReverseWordsInString {
    public static String reverseWords(String str) {

        String[] words = str.trim().split("\\s+"); // trim leading/trailing spaces and split the string into words using whitespace as delimiter
        int left = 0;
        int right = words.length - 1;
        while (left < right) {

            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;  
        }
        return String.join(" ", words); // Join the reversed words with a space in between and return the result
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        System.out.println("Reversed Sentence = " + reverseWords(str));
        sc.close();
    }
}
 /*
 ⚠ One Small Improvement (Recommended)

If the user enters only spaces:

"      "

split("\\s+") will create an issue because there are no actual words.

public static String reverseWords(String str) {

    str = str.trim();

    if (str.isEmpty()) {
        return "";
    }

    String[] words = str.split("\\s+");

    int left = 0;
    int right = words.length - 1;

    while (left < right) {

        String temp = words[left];
        words[left] = words[right];
        words[right] = temp;

        left++;
        right--;
    }

    return String.join(" ", words);
}
    
public class ReverseWordsInString {  // alternative implementation of the reverseWords method that uses StringBuilder to build the reversed sentence instead of swapping words in an array. It splits the input string into words, iterates through the words in reverse order, and appends them to a StringBuilder with a space in between. Finally, it converts the StringBuilder to a string and returns it.
this implementation may be more efficient for large strings since it avoids the overhead of creating a new array and swapping elements.

    public static String reverseWords(String str) {

        String[] words = str.trim().split("\\s+"); // Split the string into words using whitespace as delimiter and trim leading/trailing spaces

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);

            if (i != 0) {
                result.append(" "); // Add space between words
            }
        }

        return result.toString();
    }
} */
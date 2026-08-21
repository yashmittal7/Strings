import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");
        
        String longest = word[0];

        for (int i = 1; i < word.length; i++) {
            if (word[i].length() > longest.length()) {
                longest = word[i];
            }
        }
        System.out.println(longest);
        sc.close();
    }
}
/*import java
.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        // Split sentence into words
        String[] words = str.split(" ");

        // Assume the first word is the longest
        String longest = words[0];

        // Compare each word's length
        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        int sum = 0;

        for(int i = 0; i < longest.length(); i++) {
            sum += longest.charAt(i);
        }
         System.out.println("Longest Word = " + longest);
         System.out.println("ASCII Sum = " + sum);
        sc.close();
    }
} */
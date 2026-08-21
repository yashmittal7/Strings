import java.util.Scanner;
public class ASCIISumLongestWord {
    public static void asciiSumLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longest = words[0];
        // Find longest word
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        int sum = 0;
        // Calculate ASCII sum
        for (int i = 0; i < longest.length(); i++) {
            sum += longest.charAt(i);
        }
        System.out.println("Longest Word = " + longest);
        System.out.println("ASCII Sum = " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        asciiSumLongestWord(str);
        sc.close();
    }
}
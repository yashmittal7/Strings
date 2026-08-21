import java.util.Scanner;
public class CountWordsInSentence {
    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ' && (i == 0 || str.charAt(i - 1) == ' ')) { 
                 // Check if the current character is not a space and either it's the first character or the previous character is a space
                count++; // Found the start of a new word
            }
        }
        return count;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        System.out.println("Number of words = " + countWords(str));
        sc.close();
    }
}
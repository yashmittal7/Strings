import java.util.*;
public class WordOccurrenceCounter {
public static int countOccurrences(String sentence, String target) {
    String[] words = sentence.toLowerCase().split("\\s+");

    target = target.toLowerCase();
    int count = 0;

    for (String word : words) {

        if (word.equals(target)) {
            count++;
        }
    }
    return count;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String sentence = sc.nextLine();
    System.out.print("Enter the word to search: ");
    String target = sc.nextLine();

    int count = countOccurrences(sentence, target);
    System.out.println("Occurrences = " + count);
    sc.close();
}
}
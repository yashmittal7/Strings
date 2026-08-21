import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateWords {

    public static String removeDuplicateWords(String str) {

        String[] words = str.split("\\s+");

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (String word : words) { // word is a variable that represents each individual word in the array of words obtained by splitting the input string str. The for-each loop iterates over each word in the words array, allowing the code inside the loop to process each word one at a time. In this case, it adds each word to the LinkedHashSet set, which automatically handles duplicates by only keeping unique words in the order they were first encountered.
            set.add(word);          // set.add(word) adds the current word to the LinkedHashSet set. If the word is already present in the set, it will not be added again, effectively removing duplicates while preserving the order of first occurrence.
        }

        return String.join(" ", set);   // String.join(" ", set) takes all the unique words stored in the LinkedHashSet set and concatenates them into a single string, with each word separated by a space. The result is a string that contains only the unique words from the original input, in the order they first appeared.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        System.out.println(removeDuplicateWords(str));
        sc.close();
    }
}
/*import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateWords {

    public static String removeDuplicates(String str) {

        String[] words = str.split("\\s+");

        HashSet<String> set = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            if (!set.contains(word)) {

                set.add(word);
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        System.out.println(removeDuplicates(str));

        sc.close();
    }
}
    */
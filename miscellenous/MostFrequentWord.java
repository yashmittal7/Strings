import java.util.*;
public class MostFrequentWord {

    public static void mostFrequentWord(String str) {

        String[] words = str.split("\\s+");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        String most = words[0];

        for (String word : words) {
            if (map.get(word) > map.get(most)) {
                most = word;
            }
            }
        System.out.println("Most Frequent Word = " + most);
        System.out.println("Frequency = " + map.get(most));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        mostFrequentWord(str);
        sc.close();
    }
}
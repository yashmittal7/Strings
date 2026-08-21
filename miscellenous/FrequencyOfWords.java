import java.util.*;
public class FrequencyOfWords {
    public static void wordFrequency(String str) {
        String[] words = str.split("\\s+");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); // LinkedHashMap is used to maintain the order of insertion while counting the frequency 
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (String word : map.keySet()) {
            System.out.println(word + " = " + map.get(word));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        wordFrequency(str);
        sc.close();
    }
}

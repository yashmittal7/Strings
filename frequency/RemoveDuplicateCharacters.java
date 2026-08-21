import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static String removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch); // Keep first occurrence , what it does actually is 
                //  // if we use result = result +ch // then it will create a new string every time and will take O(n^2) time complexity, so we use StringBuilder which is mutable and takes O(n) time complexity 
            }
        }
        return result.toString(); // Convert StringBuilder to String
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Result = " + removeDuplicates(str));
        sc.close();
    }
}
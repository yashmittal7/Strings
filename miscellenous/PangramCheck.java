import java.util.HashSet;
import java.util.Scanner;
public class PangramCheck {
    public static boolean isPangram(String str) {

        HashSet<Character> set = new HashSet<>();

        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                set.add(ch);
            }
        }
        return set.size() == 26; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        if (isPangram(str)) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
        sc.close();
    }
}
import java.util.Scanner;
public class CountVowelsAndConsonants {
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i)); // Convert to lowercase 

            if (!Character.isLetter(ch)) {
                continue; // Ignore digits, spaces and special characters skipping to the next iteration of the loop
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        countVowelsAndConsonants(str);
        sc.close();
    }
}

import java.util.Scanner;
public class RemoveVowels {
    public static String removeVowels(String str) {
        
        StringBuilder result = new StringBuilder();

        String vowels = "aeiouAEIOU";       // String containing all vowels (both lowercase and uppercase)

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (vowels.indexOf(ch) == -1) {  // Check if the character is not a vowel by checking if its index in the vowels string is -1 (not found). 
                result.append(ch); //If it's not a vowel, append it to the result.
            }
        }
        return result.toString(); // Convert StringBuilder to String and return the result.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("After Removing Vowels: " + removeVowels(str));
        sc.close();
    }
}
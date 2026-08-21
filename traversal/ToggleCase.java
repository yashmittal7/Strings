import java.util.Scanner;
public class ToggleCase {
    public static String toggleCase(String str) {

        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient string concatenation, stringbuilder is mutable, so it can be modified without creating new objects, which is more efficient than using String concatenation in a loop. 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch)); // Upper → Lower
            } 
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch)); // Lower → Upper
            } 
            else {
                result.append(ch); // Keep digits, spaces and symbols unchanged
            }
        }
        return result.toString(); // Convert StringBuilder back to String 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Toggled String = " + toggleCase(str));
        sc.close();
    }
}
/*
// this is an alternative implementation of the toggleCase method that uses a char array for in-place modification instead of using StringBuilder. It converts the input string to a char array, iterates through each character, and toggles its case if it's an uppercase or lowercase letter. Finally, it constructs a new string from the modified char array and returns it. its equivalent to the previous implementation but may be more efficient for large strings since it avoids the overhead of StringBuilder.


public class ToggleCase { 
    public static String toggleCase(String str) {

        char[] arr = str.toCharArray(); // Convert string to char array for in-place modification

        for (int i = 0; i < arr.length; i++) {

            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]); // Upper → Lower
            }
            else if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]); // Lower → Upper
            }
        }
        return new String(arr);

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Toggled String = " + toggleCase(str));
        sc.close();
        
    }   
} */
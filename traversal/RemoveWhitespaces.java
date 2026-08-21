import java.util.Scanner;
public class RemoveWhitespaces {
    public static String removeWhitespaces(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                result.append(str.charAt(i)); // Keep non-space characters 
            }
        }
        return result.toString(); // convert the stringbuilder to string
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Result = " + removeWhitespaces(str));
        sc.close();
    }
}
/*If the interviewer says remove all whitespace (spaces, tabs \t, newlines \n, etc.), use:
            if (!Character.isWhitespace(str.charAt(i))) {
                 result.append(str.charAt(i));




Method 2 — Using String Concatenation
String result = "";
for (int i = 0; i < str.length(); i++) {

    if (str.charAt(i) != ' ') {
        result += str.charAt(i);
    }
}
return result;
Complexity
Time  : O(n²)
Space : O(n)

❌ Not preferred because every += creates a new string.
} */
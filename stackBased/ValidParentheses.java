import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Check closing brackets
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String str = sc.nextLine();

        if (isValid(str)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }

        sc.close();
    }
}

/*import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(') {
                stack.push(')');
            } 
            else if (ch == '{') {
                stack.push('}');
            } 
            else if (ch == '[') {
                stack.push(']');
            } 
            else {

                // Stack is empty OR closing bracket doesn't match
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }

        // Stack should be empty if all brackets are matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String str = sc.nextLine();

        if (isValid(str)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }

        sc.close();
    }
} */
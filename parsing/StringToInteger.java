import java.util.Scanner;

public class StringToInteger {

    public static int myAtoi(String str) {

        int i = 0;
        int sign = 1;
        int result = 0;

        // Skip leading spaces
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        // Check sign
        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {

            if (str.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        // Read digits
        while (i < str.length() && Character.isDigit(str.charAt(i))) {

            int digit = str.charAt(i) - '0';

            // Check overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {

                return sign == 1 ?
                        Integer.MAX_VALUE :
                        Integer.MIN_VALUE;
            }

            result = result * 10 + digit;

            i++;
        }

        return sign * result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println(myAtoi(str));

        sc.close();
    }
}
import java.util.Scanner;
public class IntegerToRoman {
    public static String intToRoman(int num) {
        int[] values = {
                1000, 900, 500, 400,
                100, 90, 50, 40,
                10, 9, 5, 4, 1
        };

        String[] symbols = {
                "M", "CM", "D", "CD",
                "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {

                result.append(symbols[i]);    // Add Roman symbol
                num -= values[i];             // Reduce number
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (1-3999): ");
        int num = sc.nextInt();

        System.out.println("Roman Numeral = " + intToRoman(num));

        sc.close();
    }
}
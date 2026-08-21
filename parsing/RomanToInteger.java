import java.util.Scanner;
public class RomanToInteger {
    public static int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static int romanToInt(String str) {
        int sum = 0;
        int previous = 0;
        for (int i = str.length() - 1; i >= 0; i--) { 
            int current = getValue(str.charAt(i));

            if (current < previous) {
                sum -= current;
            } else {
                sum += current;
            }
            previous = current;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman Numeral: ");
        String str = sc.nextLine().toUpperCase();
        System.out.println("Integer = " + romanToInt(str));
        sc.close();
    }
}
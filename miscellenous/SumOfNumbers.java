import java.util.*;
public class SumOfNumbers {

    static int extractSum(String str) {
        int number = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {

                number = number * 10 + (ch - '0'); 

                if (i == str.length() - 1 ||
                    !Character.isDigit(str.charAt(i + 1))) {

                    sum += number;
                    number = 0;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = extractSum(str);
        System.out.println(sum);
        sc.close();
    }
}
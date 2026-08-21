import java.util.*;
public class extractNumberss {
    static void extractNumbers(String str) {
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {

                number = number * 10 + (ch - '0'); 

                if (i == str.length() - 1 || 
                !Character.isDigit(str.charAt(i + 1))) {
                    System.out.println(number);
                    number = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        extractNumbers(str);
    }
}
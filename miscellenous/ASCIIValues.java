import java.util.Scanner;
public class ASCIIValues {
    public static void printASCII(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch + " = " + (int) ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        printASCII(str);
        sc.close();
    }
}
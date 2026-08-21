import java.util.Scanner;
public class LargestCharacter {
    public static char largestCharacter(String str) {

        char largest = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) > largest) {
                largest = str.charAt(i);
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            System.out.println("String is empty.");
        } else {
            System.out.println("Largest Character = " + largestCharacter(str));
        }
        sc.close();
    }
}
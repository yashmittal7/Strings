import java.util.Scanner;
public class CountCharacters {
    public static void countCharacters(String str) {
        int letters = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else if (ch != ' ') {
                special++;
            }
        }
        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        countCharacters(str);
        sc.close();
    }
}

/*public static void countCharacters(String str) {

    int letters = 0;
    int digits = 0;
    int special = 0;

    for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            letters++;
        }
        else if (ch >= '0' && ch <= '9') {
            digits++;
        }
        else if (ch != ' ') {
            special++;
        }
    }

    System.out.println("Letters = " + letters);
    System.out.println("Digits = " + digits);
    System.out.println("Special Characters = " + special);
} */
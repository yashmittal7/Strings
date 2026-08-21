import java.util.Scanner;

public class CheckStringRotation {

    public static boolean isRotation(String str1, String str2) {

        // Rotation is possible only if both strings have the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        String temp = str1 + str1;

        return temp.contains(str2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isRotation(str1, str2)) {
            System.out.println("Strings are rotations of each other.");
        } else {
            System.out.println("Strings are not rotations of each other.");
        }

        sc.close();
    }
}
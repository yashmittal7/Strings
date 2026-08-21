import java.util.Scanner;

public class StringCompression {
    public static int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            // Count consecutive occurrences
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }
            chars[index++] = current;

            // Write count only if greater than 1
            if (count > 1) {

                String freq = String.valueOf(count);

                for (char ch : freq.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        int newLength = compress(chars);

        System.out.print("Compressed String = ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();
        System.out.println("Length = " + newLength);

        sc.close();
    }
}
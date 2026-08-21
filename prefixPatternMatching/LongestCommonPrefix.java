import java.util.Scanner;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] words) {

        if (words.length == 0) {
            return "";
        }

        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {

            while (!words[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        System.out.println("Longest Common Prefix = " + longestCommonPrefix(words));

        sc.close();
    }
}
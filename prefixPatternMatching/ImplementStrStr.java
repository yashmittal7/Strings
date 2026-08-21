// first occurence of a string 

import java.util.Scanner;

public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter haystack: ");
        String haystack = sc.nextLine();

        System.out.print("Enter needle: ");
        String needle = sc.nextLine();

        int index = strStr(haystack, needle);

        if (index == -1) {
            System.out.println("Pattern not found");
        } else {
            System.out.println("Pattern found at index = " + index);
        }

        sc.close();
    }
}



/* 
import java.util.Scanner;

public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            while (j < needle.length() &&
                    haystack.charAt(i + j) == needle.charAt(j)) {

                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter haystack: ");
        String haystack = sc.nextLine();

        System.out.print("Enter needle: ");
        String needle = sc.nextLine();

        int index = strStr(haystack, needle);

        if (index == -1) {
            System.out.println("Pattern not found");
        } else {
            System.out.println("Pattern found at index = " + index);
        }

        sc.close();
    }
}

*/
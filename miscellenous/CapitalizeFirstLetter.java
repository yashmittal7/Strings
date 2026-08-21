import java.util.Scanner;
public class CapitalizeFirstLetter {

    public static String capitalizeWords(String str) {
        char[] arr = str.toCharArray();

        // Capitalize first character
        if (arr.length > 0 && Character.isLetter(arr[0])) {
            arr[0] = Character.toUpperCase(arr[0]);
        }
        for (int i = 1; i < arr.length; i++) {

            // Capitalize character after a space
            if (arr[i - 1] == ' ' && Character.isLetter(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        return new String(arr);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        System.out.println(capitalizeWords(str));

        sc.close();
    }
}


/*import java.util.Scanner;

public class CapitalizeFirstLetter {

    public static String capitalizeWords(String str) {

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (!words[i].isEmpty()) {    // Skip empty strings caused by multiple spaces

                words[i] = Character.toUpperCase(words[i].charAt(0))
                        + words[i].substring(1);
            }
        }
        return String.join(" ", words);
    } */
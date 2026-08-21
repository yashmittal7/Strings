import java.util.Scanner;
public class ReverseEachWord {
    public static String reverseWords(String str) {

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            char[] arr = words[i].toCharArray();

            int left = 0;
            int right = arr.length - 1;

            // Reverse current word
            while (left < right) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            words[i] = new String(arr);
        }
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        System.out.println(reverseWords(str));
        sc.close();
    }
}
/*import java.util.Scanner;

public class ReverseEachWord {

    public static String reverseEachWord(String str) {

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        System.out.println("Output: " + reverseEachWord(str));

        sc.close();
    }
} */
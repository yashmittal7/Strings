import java.util.Scanner;
public class ReverseAlternateWords {
public static String reverseAlternateWords(String str) {
    
    String[] words = str.split("\\s+");

    for (int i = 1; i < words.length; i += 2) {

        char[] arr = words[i].toCharArray();

        int left = 0;
        int right = arr.length - 1;

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
        System.out.println(reverseAlternateWords(str));
        sc.close();
    }
}


/* public static String reverseAlternateWords(String str) {

        String[] words = str.split("\\s+");

        for (int i = 1; i < words.length; i += 2) {

            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ", words);
    }


*/
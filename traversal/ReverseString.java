import java.util.Scanner;
public class ReverseString {

    public static String reverseString(String str) {
        char[] arr = str.toCharArray(); // Convert the string to a character array
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            
            char temp = arr[left]; 
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr); // Convert the character array back to a string
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reversed String = " + reverseString(str));
        sc.close();
    }
}
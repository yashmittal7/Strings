import java.util.Scanner;
public class swapLetter {
    
    static String swapXY(String str, char x, char y) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                arr[i] = y;
            } else if (arr[i] == y) {
                arr[i] = x;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char x = sc.next().charAt(0);
        char y = sc.next().charAt(0);

        System.out.println(swapXY(str, x, y));
    }
}
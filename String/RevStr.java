
import java.util.Scanner;

public class RevStr {

    static String Rev(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        String result = Rev(str);
        System.out.println("Reversed String = " + result);

    }
}

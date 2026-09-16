
import java.util.*;

public class RevWords {

    static String rev(String str) {
        String[] words = str.split(" ");
        int left = 0;
        int right = words.length - 1;
        while (left < right) {

            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(rev(str));
    }

}

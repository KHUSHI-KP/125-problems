
import java.util.*;

public class HighestFreqChar {

    static char find(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;

        }
        char res = str.charAt(0);
        int max = freq[res];
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                res = ch;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(find(str));
    }
}

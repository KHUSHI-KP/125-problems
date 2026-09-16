
import java.util.*;

public class FirstRepeatingChar {

    static char find(String str) {
        boolean[] seen = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (seen[ch]) {
                return ch;
            }
            seen[ch] = true;
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(find(str));
    }
}

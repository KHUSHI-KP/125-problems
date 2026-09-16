
import java.util.*;

public class RemDup {

    static String remove(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                res.append(ch);
                seen[ch] = true;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(remove(str));
    }
}

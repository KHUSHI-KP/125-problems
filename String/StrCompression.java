
import java.util.*;

public class StrCompression {

    static String compress(String str) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                res.append(str.charAt(i - 1));
                res.append(count);
                count = 1;
            }
        }
        return res.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(compress(str));
    }

}

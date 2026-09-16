
import java.util.*;

public class SeparateChar {

    static void sep(String str) {
        StringBuilder letters = new StringBuilder();
        StringBuilder nums = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                nums.append(ch);
            }
        }
        System.out.println("Lettes = " + letters);
        System.out.println("Numbers = " + nums);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        sep(str);
    }
}

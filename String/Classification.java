
import java.util.Scanner;

public class Classification {

    static void count(String str) {
        str = str.toLowerCase();
        int vowels = 0, conso = 0, dig = 0, spaces = 0, special = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                conso++;
            } else if (ch >= '0' && ch <= '9') {
                dig++;
            } else if (ch == ' ') {
                spaces++;
            } else {
                special++;
            }

        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Conso = " + conso);
        System.out.println("Digits = " + dig);
        System.out.println("spaces = " + spaces);
        System.out.println("Special = " + special);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        count(str);
    }
}

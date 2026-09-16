
import java.util.Scanner;

public class Count {

    static int Countdig(int num) {
        if (num == 0) {
            return 1;
        }
        num = Math.abs(num);
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println(Countdig(num));

    }
}


import java.util.Scanner;

public class Arms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int original = num;
        int count = 0;
        int sum = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }

        num = original;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, count);
            num = num / 10;

        }
        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong ");
        }
    }

}

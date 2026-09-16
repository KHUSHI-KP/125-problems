
import java.util.*;

public class primenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        int num = sc.nextInt();
        boolean prime = true;
        if (num < 2) {
            prime = false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;

            }
        }
        if (prime) {
            System.out.println("prime number");
        } else {
            System.out.println("Not a Prime number");
        }
    }
}

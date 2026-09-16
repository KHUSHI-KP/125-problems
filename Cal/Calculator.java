
import java.util.*;

public class Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter operation");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("cant divided by 0");
                }
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid");
        }

    }
}

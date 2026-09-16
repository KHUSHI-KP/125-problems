
public class gcdnlcm {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        System.out.println("GCD = " + gcd(a, b));
        System.out.println("LCM = " + lcm(a, b));
    }
}

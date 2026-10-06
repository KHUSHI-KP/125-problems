
public class FactMem {

    static int[] dp = new int[100];

    static int fact(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = n * fact(n - 1);

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}

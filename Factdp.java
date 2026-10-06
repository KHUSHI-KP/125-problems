
public class Factdp {

    static int fact(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}

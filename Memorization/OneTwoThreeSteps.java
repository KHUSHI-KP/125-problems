
public class OneTwoThreeSteps {

    static int ways(int n, int[] memo) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = ways(n - 1, memo)
                + ways(n - 2, memo)
                + ways(n - 3, memo);

        return memo[n];
    }

    public static void main(String[] args) {

        int n = 4;

        int[] memo = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }

        System.out.println(ways(n, memo));
    }
}

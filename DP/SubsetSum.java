
public class SubsetSum {

    static boolean subsetSum(int[] arr, int target) {

        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        for (int num : arr) {

            for (int sum = target; sum >= num; sum--) {

                dp[sum] = dp[sum] || dp[sum - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {

        int[] arr = {3, 34, 4, 12, 5, 2};

        System.out.println(
                subsetSum(arr, 9)
        );
    }
}

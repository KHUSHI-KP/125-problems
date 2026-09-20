
public class HouseRobber {

    static int rob(int[] arr, int index, int[] memo) {

        if (index >= arr.length) {
            return 0;
        }

        if (memo[index] != -1) {
            return memo[index];
        }

        int take = arr[index] + rob(arr, index + 2, memo);

        int skip = rob(arr, index + 1, memo);

        memo[index] = Math.max(take, skip);

        return memo[index];
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 9, 3, 1};

        int[] memo = new int[arr.length];

        for (int i = 0; i < memo.length; i++) {
            memo[i] = -1;
        }

        System.out.println(rob(arr, 0, memo));
    }
}


public class MaxsumWin {

    static int maxSum(int[] arr, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {

            sum += arr[i];
            sum -= arr[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};

        System.out.println(maxSum(arr, 3));
    }
}

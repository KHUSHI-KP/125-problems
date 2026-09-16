
import java.util.*;

public class UniquePairs {

    static void findPairs(int[] arr, int target) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                System.out.println(arr[left] + " " + arr[right]);

                int leftValue = arr[left];
                int rightValue = arr[right];

                while (left < right && arr[left] == leftValue) {
                    left++;
                }

                while (left < right && arr[right] == rightValue) {
                    right--;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 5, 6};

        findPairs(arr, 7);
    }
}

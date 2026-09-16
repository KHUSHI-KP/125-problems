
import java.util.*;

public class TwoSumUn {

    static boolean twoSum(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            int required = target - num;

            if (set.contains(required)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 9, 3};
        int target = 10;

        System.out.println(twoSum(arr, target));
    }
}


import java.util.*;

public class SubArrSumEqk {

    static void find(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (map.containsKey(sum - k)) {

                int start = map.get(sum - k) + 1;

                System.out.print("Subarray = ");

                for (int j = start; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }

                return;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println("No subarray found");
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        find(arr, 5);
    }
}

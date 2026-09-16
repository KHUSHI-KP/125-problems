
import java.util.*;

public class AllDup {

    static List<Integer> find(int[] arr) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                result.add(Math.abs(arr[i]));
            } else {
                arr[index] = -arr[index];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(find(arr));
    }
}

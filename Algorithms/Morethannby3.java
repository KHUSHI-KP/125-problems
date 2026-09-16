
import java.util.*;

public class Morethannby3 {

    static List<Integer> find(int[] arr) {

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        for (int num : arr) {

            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : arr) {

            if (num == candidate1) {
                count1++;
            }

            if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();

        if (count1 > arr.length / 3) {
            result.add(candidate1);
        }

        if (candidate2 != candidate1
                && count2 > arr.length / 3) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 3};

        System.out.println(find(arr));
    }
}

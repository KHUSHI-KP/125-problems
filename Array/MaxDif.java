
public class MaxDif {

    static int find(int[] arr) {

        int min = arr[0];
        int maxDifference = arr[1] - arr[0];

        for (int j = 1; j < arr.length; j++) {

            maxDifference = Math.max(maxDifference, arr[j] - min);
            min = Math.min(min, arr[j]);
        }

        return maxDifference;
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println(find(arr));
    }
}

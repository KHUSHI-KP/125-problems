
public class ProductExceptSelf {

    static int[] product(int[] arr) {

        int n = arr.length;

        int[] result = new int[n];

        int prefix = 1;

        for (int i = 0; i < n; i++) {

            result[i] = prefix;

            prefix = prefix * arr[i];
        }

        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {

            result[i] = result[i] * suffix;

            suffix = suffix * arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int[] result = product(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

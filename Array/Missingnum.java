
public class Missingnum {

    static int find(int[] arr) {

        int result = arr.length;

        for (int i = 0; i < arr.length; i++) {

            result = result ^ i ^ arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 4, 5, 6};

        System.out.println(find(arr));
    }
}

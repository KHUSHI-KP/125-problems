
public class ArrayMax {

    static int max(int[] arr, int index) {

        if (index == arr.length - 1) {
            return arr[index];
        }

        int maxOfRest = max(arr, index + 1);

        if (arr[index] > maxOfRest) {
            return arr[index];
        } else {
            return maxOfRest;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 40, 15};

        System.out.println(max(arr, 0));
    }
}

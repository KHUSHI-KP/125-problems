
public class ActualMaxSubArr {

    static void find(int[] arr) {

        int current = arr[0];
        int max = arr[0];

        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > current + arr[i]) {
                current = arr[i];
                start = i;
            } else {
                current = current + arr[i];
            }

            if (current > max) {
                max = current;
                bestStart = start;
                bestEnd = i;
            }
        }

        System.out.println("Maximum Sum = " + max);

        System.out.print("Subarray = ");

        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        find(arr);
    }
}

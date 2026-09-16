
public class SecondLargest {

    static int find(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};

        System.out.println(find(arr));
    }
}

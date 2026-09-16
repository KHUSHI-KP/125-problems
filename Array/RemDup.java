
public class RemDup {

    static int remove(int[] arr) {

        int index = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {

                arr[index] = arr[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};

        int length = remove(arr);

        System.out.println("Length = " + length);

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


public class Ref {

    static void change(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        change(arr);

        System.out.println(arr[0]);
    }
}

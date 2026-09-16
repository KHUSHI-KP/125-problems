
public class Val {

    static void change(int x) {
        x = 5;
    }

    public static void main(String[] args) {

        int x = 5;

        change(x);

        System.out.println(x);
    }
}

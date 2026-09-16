
public class MethodOverLoading {

    static double Area(double radius) {
        return 3.14 * radius * radius;
    }

    static int Area(int l, int b) {
        return l * b;
    }

    static double Area(double base, double h) {
        return 0.5 * base * h;
    }

    public static void main(String[] args) {
        System.out.println("Circle = " + Area(5));
        System.out.println("Rect = " + Area(10, 5));
        System.out.println("Triangle = " + Area(10.0, 5.0));
    }
}

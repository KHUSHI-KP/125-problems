
public class StringRotation {

    static boolean isRotation(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        String combined = a + a;

        return combined.contains(b);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("abcd", "cdab"));
    }
}

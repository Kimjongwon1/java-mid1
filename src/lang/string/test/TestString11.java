package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello  Java";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("rev = " + rev);
    }
}

package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5","3.0"};
        double b = 0;
        for (String a :array) {
                  double c = Double.parseDouble(a);
                  b += c;
        }
        System.out.println("b = " + b);

    }
}

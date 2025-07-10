package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String st1 = "10";
        String st2 = "20";

        int num1 =  Integer.parseInt(st1);
        int num2 = Integer.parseInt(st2);
        int sum = num1 + num2;
        System.out.println("두 수의 합: " + sum);
    }
}

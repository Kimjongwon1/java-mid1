package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        //String -> Integer
        Integer a = Integer.valueOf(str);
        System.out.println("a = "+ a.getClass());
        //Integer -> int
        int b = a.intValue();
        System.out.println("b = " + b);
        //int -> Integer
        Integer integer2 = Integer.valueOf(b);
        System.out.println("integer2 = " + integer2);
    }
}

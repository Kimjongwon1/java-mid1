package lang.immutable.address;

public class PrimitveMain {

    public static void main(String[] args) {
        int a = 10;
        int b = a; // a->b , 값 복사 후 대입
        System.out.println("a = " + a);
        System.out.println("b = "+ b);

        b =20;
        System.out.println("20 -> b" );
        System.out.println("a = " + a);
        System.out.println("b = "+ b);

    }
}

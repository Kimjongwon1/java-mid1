package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에 삭제예정
        Integer integer = Integer.valueOf(10);
        Integer integer2 = Integer.valueOf(10);
        Long longobj = Long.valueOf(100);
        Double dobleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integer = " + integer);
        System.out.println("dobleObj = " + dobleObj);
        System.out.println("longobj = " + longobj);

        System.out.println("내부값 읽기 = ");
        int intValue = integer.intValue();
        System.out.println("intValue = " + intValue);
        long longvalue = longobj.longValue();
        System.out.println("longvalue = " + longvalue);

        System.out.println("비교");
//        System.out.println(" == " + (newInteger == integer));
        System.out.println("equals: " + (newInteger.equals(integer)));
        System.out.println("equals: " + (integer.equals(integer2)));

    }
}

package lang.wrapper;

public class WrapperUtiisMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); //숫자, 래퍼 객체 변환
        Integer.valueOf("10");//문자열, 래퍼 객체 변환
        Integer.parseInt("10"); //문자열 전용, 기본형 변환

        //비교
        int comp = i1.compareTo(20);
        System.out.println("comp = " + comp);
        
        //산술 연산
        System.out.println("sum  = " + Integer.sum(10,20));
        System.out.println("min = " + Integer.min(10, 20));
        System.out.println("max = " + Integer.max(10,20));

    }
}

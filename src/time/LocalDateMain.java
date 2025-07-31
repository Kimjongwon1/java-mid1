package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013,11,21);
        System.out.println("nowDate = " + nowDate);
        System.out.println("ofDate = " + ofDate);

        //계산(불변) , 새로운 객체를 생성해서 반환
        ofDate = ofDate.plusDays(10);
        System.out.println("ofDate = " + ofDate);
    }
}

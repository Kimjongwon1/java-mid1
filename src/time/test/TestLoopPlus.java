package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024,1,1);
        for (int i = 0; i < 5; i++) {
           LocalDate nextDate = startDate.plus(2*i, ChronoUnit.WEEKS); //startDate.plusWeeks(2*i) 가능
            System.out.println("날짜 "+ (i+1) + ": " + nextDate);
        }
    }
}

package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {

    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println("value.range() = " + value.range());
        }

        System.out.println("ChronoField.MONTH_OF_YEAR = " + ChronoField.MONTH_OF_YEAR.range());

    }
}

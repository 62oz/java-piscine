package DifferenceBetweenDate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/*
Write a function durationBetweenTime that returns the duration between the times as parameter. Must always be positive.
Write a function periodBetweenDate that returns the period between the dates as parameter.Must always be positive.
Write a function numberOfHoursBetweenDateTime that returns the number of hours between the date times as parameter. Must always be positive.
 */

public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
        return Duration.between(localTime1, localTime2).abs();
    }

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        Period period = Period.between(date1, date2);
        return period.isNegative() ? period.negated() : period;
    }

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, 1, 15);
        LocalDate date2 = LocalDate.of(2022, 2, 20);

        Period difference = periodBetweenDate(date1, date2);
        System.out.println("Difference: " + difference.getYears() + " years, " + difference.getMonths() + " months, " + difference.getDays() + " days");
    }


    public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        return Duration.between(dateTime1, dateTime2).abs().toHours();
    }

}

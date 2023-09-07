package ParseDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        String[] parts = stringDate.split(" ");
        int day = Integer.parseInt(parts[1]);
        int month = getMonthNumber(parts[2]);
        int year = Integer.parseInt(parts[3]);
        return LocalDate.of(year, month, day);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        String[] parts = stringDate.split(" ");
        int hours = Integer.parseInt(parts[0]);
        if (parts[3].equals("soir,")) {
            hours += 12;
        }

        int minutes = Integer.parseInt(parts[4]);
        int seconds = Integer.parseInt(parts[7]);
        return LocalTime.of(hours, minutes, seconds);
    }

    private static int getMonthNumber(String monthName) {
        switch (monthName) {
            case "janvier":
                return 1;
            case "février":
                return 2;
            case "mars":
                return 3;
            case "avril":
                return 4;
            case "mai":
                return 5;
            case "juin":
                return 6;
            case "juillet":
                return 7;
            case "août":
                return 8;
            case "septembre":
                return 9;
            case "octobre":
                return 10;
            case "novembre":
                return 11;
            case "décembre":
                return 12;
            default:
                return -1; // Invalid month
        }
    }
}

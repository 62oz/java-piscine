package FormatDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/* Write a function formatToFullText that returns a formatted string using the date as parameter. The awaited format is Le 22 août de l'an 2021 à 13h25m et 46s
Write a function formatSimple that returns a formatted string using the date as parameter. The awaited format is febbraio 13 22
Write a function formatIso that returns a formatted string using the time as parameter. The awaited format is 16:18:56.8495847 */

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        return String.format("Le %d %s de l'an %d à %dh%dm et %ds", dateTime.getDayOfMonth(), getMonthNameFR(dateTime.getMonthValue()), dateTime.getYear(), dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond());
    }

    public static String formatSimple(LocalDate date) {
        return String.format("%s %d %d", getMonthNameITA(date.getMonthValue()), date.getDayOfMonth(), date.getYear());
    }

    public static String formatIso(LocalTime time) {
        return String.format("%d:%d:%d.%09d", time.getHour(), time.getMinute(), time.getSecond(), time.getNano());
    }

    private static String getMonthNameFR(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "janvier";
            case 2:
                return "février";
            case 3:
                return "mars";
            case 4:
                return "avril";
            case 5:
                return "mai";
            case 6:
                return "juin";
            case 7:
                return "juillet";
            case 8:
                return "août";
            case 9:
                return "septembre";
            case 10:
                return "octobre";
            case 11:
                return "novembre";
            case 12:
                return "décembre";
            default:
                return "Invalid month";
        }
    }

    private static String getMonthNameITA(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "gennaio";
            case 2:
                return "febbraio";
            case 3:
                return "marzo";
            case 4:
                return "aprile";
            case 5:
                return "maggio";
            case 6:
                return "giugno";
            case 7:
                return "luglio";
            case 8:
                return "agosto";
            case 9:
                return "settembre";
            case 10:
                return "ottobre";
            case 11:
                return "novembre";
            case 12:
                return "dicembre";
            default:
                return "Invalid month";
        }
    }

}

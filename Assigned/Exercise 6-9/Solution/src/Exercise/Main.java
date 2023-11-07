package Exercise;

import java.time.*;

public class Main {

    public static void main(String[] args) {

        String dateToParse = "2023-03-01T13:00:00Z";
        OffsetDateTime parsedDate = parseDate(dateToParse);
        int year = yearFromDate(parsedDate);
        Month month = monthFromDate(parsedDate);
        int monthValue = monthValueFromDate(parsedDate);
        int dayOfTheYear = dayOfYearFromDate(parsedDate);
        int dayOfMonth = dayOfMonthFromDate(parsedDate);
        DayOfWeek dayOfWeek = dayOfWeekFromDate(parsedDate);

        System.out.println("Date to parse = " + dateToParse);
        System.out.println("Parsed date = " + parsedDate);
        System.out.println("Year extracted from OffsetDateTime object = " + year);
        System.out.println("Month object extracted from OffsetDateTime object = " + month);
        System.out.println("Month value extracted from OffsetDateTime object = " + monthValue);
        System.out.println("Day of the year extracted from OffsetDateTime object = " + dayOfTheYear);
        System.out.println("Day of the month extracted from OffsetDateTime object = " + dayOfMonth);
        System.out.println("Day of the week object extracted from OffsetDateTime object = " + dayOfWeek);

    }

    public static DayOfWeek dayOfWeekFromDate(OffsetDateTime date) {
        if (date != null) {
            return date.getDayOfWeek();
        } else {
            throw new DateTimeException("The passed date is null and cannot extract the day of the week from it");
        }
    }

    public static int dayOfMonthFromDate(OffsetDateTime date) {
        if (date != null) {
            return date.getDayOfMonth();
        } else {
            throw new DateTimeException("The passed date is null and cannot extract the day of the month from it");
        }
    }

    public static int dayOfYearFromDate(OffsetDateTime date) {
        if (date != null) {
            return date.getDayOfYear();
        } else {
            throw new DateTimeException("The passed date is null and cannot extract the day of the year from it");
        }
    }

    public static int monthValueFromDate(OffsetDateTime date) {
        if (date != null) {
            return date.getMonthValue();
        } else {
            throw new DateTimeException("The passed date is null and cannot extract the month value from it");
        }
    }

    public static Month monthFromDate(OffsetDateTime date) {
        if (date != null) {
            return date.getMonth();
        } else {
            throw new DateTimeException("The passed date is null and cannot extract the month from it");
        }
    }

    public static int yearFromDate(OffsetDateTime date) {
        if (date != null) {
            return date.getYear();
        } else {
            throw new DateTimeException("The passed date is null and cannot extract the year from it");
        }
    }

    public static OffsetDateTime parseDate(String dateToParse) {

        if (dateToParse == null) {
            throw new DateTimeException("Passed a null value that cannot be parsed");
        } else if (dateToParse.isEmpty()) {
            throw new DateTimeException("The passed string is empty and cannot be parsed");
        } else if (dateToParse.isBlank()) {
            throw new DateTimeException("The passed string is blank and cannot be parsed");
        }else {
            try {
                return OffsetDateTime.parse(dateToParse);
            } catch (Exception e) {
                throw  new DateTimeException("Text cannot be parsed");
            }
        }
    }





}

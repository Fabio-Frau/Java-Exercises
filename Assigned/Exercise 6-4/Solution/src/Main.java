import java.sql.SQLOutput;
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {




//        System.out.println(data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));
//        System.out.println(dataPlus1Year.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));
//        System.out.println(dataMinus1Month.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));
//        System.out.println(dataPlus7Days.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));

        String dateToParse = "2023-03-01T13:00:00Z";
        String pattern = "dd MMMM yyyy";
        Locale localization = Locale.ITALY;
        OffsetDateTime parsedDate = parseDate(dateToParse);
        OffsetDateTime dataPlus1year = addYears(parsedDate,1);
        OffsetDateTime dataMinus1Month = subtractMonths(dataPlus1year,1);
        OffsetDateTime dataPlus7Days = addDays(dataMinus1Month, 7);

        String parsedDateFormatted = convertUsingOfPattern(parsedDate, pattern, localization);
        String dataPlus1YearFormatted = convertUsingOfPattern(dataPlus1year, pattern, localization);
        String dataMinus1MonthFormatted = convertUsingOfPattern(dataMinus1Month, pattern, localization);
        String dataPlus7DaysFormatted = convertUsingOfPattern(dataPlus7Days, pattern, localization);

        System.out.println("Not formatted dates.");
        System.out.println("Date to parse = " + dateToParse);
        System.out.println("Parsed date = " + parsedDate);
        System.out.println("Parsed date plus 1 year = " + dataPlus1year);
        System.out.println("Previous date minus 1 month = " + dataMinus1Month);
        System.out.println("Previous date plus 7 days = " + dataPlus7Days);
        System.out.println();
        System.out.println("Formatted dates using \"" + pattern + "\" pattern and " + localization + " localization.");
        System.out.println("Parsed date formatted = " + parsedDateFormatted);
        System.out.println("Parsed date plus 1 year formatted = " + dataPlus1YearFormatted);
        System.out.println("Previous date minus 1 month formatted = " + dataMinus1MonthFormatted);
        System.out.println("Previous date plus 7 days formatted = " + dataPlus7DaysFormatted);






    }

    public static String convertUsingOfPattern(OffsetDateTime date, String pattern, Locale localization ) {
        if (date == null) {
            throw new DateTimeException("Passed date is null and cannot be formatted");
        } else if (pattern == null) {
            throw new NullPointerException("Provided pattern is null and cannot be used to format a date");
        } else if (localization == null) {
            throw new NullPointerException("Provided localization is null and cannot be used to format a date");
        } else {
            //Throws: IllegalArgumentException – if the pattern is invalid
            return date.format(DateTimeFormatter.ofPattern(pattern, localization));
        }
    }


    /*Note well plusYears, plusMonths, minusMonths and so on work with negative numbers as well, but I'm constraining
    my methods to practice with testing later on */

    public static OffsetDateTime addDays(OffsetDateTime date, int daysAdded) {
        if (date == null) {
            throw new DateTimeException("The passed date is null and cannot add anything");
        } else if (daysAdded <= 0) {
            throw new IllegalArgumentException("The value of the months to subtract must be greater than or equal to zero");
        } else {
            return date.plusDays(daysAdded);
        }
    }

    public static OffsetDateTime subtractMonths(OffsetDateTime date, int monthsSubtracted) {
        if (date == null) {
            throw new DateTimeException("The passed date is null and cannot add anything");
        } else if (monthsSubtracted <= 0) {
            throw new IllegalArgumentException("The value of the months to subtract must be greater than or equal to zero");
        } else {
            return date.minusMonths(monthsSubtracted);
        }
    }

    public static OffsetDateTime addYears(OffsetDateTime date, int yearsAdded) {
        if (date == null) {
            throw new DateTimeException("The passed date is null and cannot add anything");
        } else if (yearsAdded <= 0) {
            throw new IllegalArgumentException("The value of the years to add must be greater than or equal to zero");
        } else {
            return date.plusYears(yearsAdded);
        }
    }

    public static OffsetDateTime parseDate(String dateToParse) {
        if (dateToParse != null) {
            return OffsetDateTime.parse(dateToParse);
        } else {
            throw new DateTimeException("Passed a null value that cannot be parsed");
        }
    }
}

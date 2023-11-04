import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {

        String dateToParse = "2002-03-01T13:00:00z";
        OffsetDateTime parsedDate = parseDate(dateToParse);
        String dateFull = convertToFullString(parsedDate);
        String dateLong = convertToLongString(parsedDate);
        String dateMedium = convertToMediumString(parsedDate);
        String dateShort = convertToShortString(parsedDate);

        System.out.println("Parsed date = " + parsedDate);
        System.out.println("Full date = " + dateFull);
        System.out.println("Long date = " + dateLong);
        System.out.println("Medium date = " + dateMedium);
        System.out.println("Short date = " + dateShort);

    }

    public static OffsetDateTime parseDate(String dateToParse) {
        if (dateToParse != null) {
            return OffsetDateTime.parse(dateToParse);
        }
        else {
            throw new DateTimeException("Passed a null value that cannot be parsed");
        }
    }

    public static String convertToFullString(OffsetDateTime data) {
        if (data != null) {
            return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        } else {
            throw new DateTimeException("Passed a null value that cannot be formatted");
        }
    }

    public static String convertToLongString(OffsetDateTime data) {
        if (data != null) {
            return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        } else {
            throw new DateTimeException("Passed a null value that cannot be formatted");
        }
    }

    public static String convertToMediumString(OffsetDateTime data) {
        if (data != null) {
            return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        } else {
            throw new DateTimeException("Passed a null value that cannot be formatted");
        }
    }

    public static String convertToShortString(OffsetDateTime data) {
        if (data != null) {
            return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        } else {
            throw new DateTimeException("Passed a null value that cannot be formatted");
        }
    }
}

package Exercise;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        String dateToParse = "2023-03-01T13:00:00Z";
        String pattern = "dd MMMM yyyy";
        OffsetDateTime parsedDate = parseDate(dateToParse);
        String patternDateString = convertUsingOfPattern(parsedDate, pattern );

        System.out.println("Date to parse = " + dateToParse);
        System.out.println("Pattern = " + pattern);
        System.out.println("Parsed date = " + parsedDate);
        System.out.println("Formatted date using ofPattern = " + patternDateString);


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

    //
    public static String convertUsingOfPattern(OffsetDateTime date, String pattern) {
        if (date == null) {
            throw new DateTimeException("Passed date is null and cannot be formatted");
        } else if (pattern == null) {
            throw new NullPointerException("Provided pattern is null and cannot be used to format a date");
        }else if(pattern.isEmpty()) {
            throw new DateTimeException("Provided pattern is empty and cannot be used to format a date");
        } else if (pattern.isBlank()) {
            throw new DateTimeException("Provided pattern is blank and cannot be used to format a date");
        } else{
            try {
                //Throws: IllegalArgumentException – if the pattern is invalid
                return date.format(DateTimeFormatter.ofPattern(pattern).withLocale(Locale.ITALY));
            } catch (Exception e) {
                throw new DateTimeException("Formatting error has occurred");
            }
        }
    }


}

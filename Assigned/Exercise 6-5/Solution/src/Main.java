import java.time.DateTimeException;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        String dateToParse1 = "2023-03-01T13:00:00Z";
        String dateToParse2 = "2024-03-01T13:00:00Z";
        OffsetDateTime date1Parsed = parseDate(dateToParse1);
        OffsetDateTime date2Parsed = parseDate(dateToParse2);
        OffsetDateTime dateNow = OffsetDateTime.now();

        boolean isDateBefore = before(date1Parsed, date2Parsed);
        boolean isDateAfter = after(date2Parsed, date1Parsed );
        boolean isDate1EqualNow = equal(date1Parsed, dateNow);
        boolean isDate2EqualNow = equal(date2Parsed, dateNow);

        System.out.println("Is " + date1Parsed + " before " + date2Parsed + " = " + isDateBefore);
        System.out.println("Is " + date2Parsed + " after " + date1Parsed + " = " + isDateAfter);
        System.out.println("Is " + date1Parsed + " equal to " + dateNow + " = " + isDate1EqualNow);
        System.out.println("Is " + date2Parsed + " equal to " + dateNow + " = " + isDate2EqualNow);

    }

    public static boolean equal (OffsetDateTime data1, OffsetDateTime data2) {
        if (data1 != null && data2 != null) {
            return data1.isEqual(data2);
        } else {
            throw new DateTimeException("Passed a null value for a date and cannot compare");
        }
    }

    public static boolean after (OffsetDateTime data1, OffsetDateTime data2) {
        if (data1 != null && data2 != null) {
            return data1.isAfter(data2);
        } else {
            throw new DateTimeException("Passed a null value for a date and cannot compare");
        }
    }

    public static boolean before (OffsetDateTime data1, OffsetDateTime data2) {
        if (data1 != null && data2 != null) {
            return data1.isBefore(data2);
        } else {
            throw new DateTimeException("Passed a null value for a date and cannot compare");
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

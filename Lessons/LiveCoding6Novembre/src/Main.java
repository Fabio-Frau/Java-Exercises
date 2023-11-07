import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String dateToParse = "2023-03-01T13:00:00Z";

    }

    public static String parseDate(String dateToParse) {
        OffsetDateTime date = OffsetDateTime.parse(dateToParse);
        return DateTimeFormatter.ISO_DATE.format(date);
    }


}

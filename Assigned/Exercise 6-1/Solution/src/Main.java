import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00z");
        //Note well:  Unable to extract ZoneId from temporal 2002-03-01T13:00Z
        String fullString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String mediumString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String shortString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println("Data FULL");
        System.out.println(fullString);
        System.out.println("Data MEDIUM");
        System.out.println(mediumString);
        System.out.println("Data SHORT");
        System.out.println(shortString);

    }
}

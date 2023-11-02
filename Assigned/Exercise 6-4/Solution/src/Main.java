import java.sql.SQLOutput;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dataPlus1Year = data.plusYears(1);
        OffsetDateTime dataMinus1Month = dataPlus1Year.minusMonths(1);
        OffsetDateTime dataPlus7Days = dataMinus1Month.plusWeeks(1);

        System.out.println(data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));
        System.out.println(dataPlus1Year.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));
        System.out.println(dataMinus1Month.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));
        System.out.println(dataPlus7Days.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY)));


    }
}

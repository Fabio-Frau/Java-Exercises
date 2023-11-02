import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {

    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = data.getYear();
        Month month = data.getMonth();
        int dayOfYear = data.getDayOfYear();
        int dayOfMoNTH = data.getDayOfMonth();
        DayOfWeek dayOfWeek = data.getDayOfWeek();

        System.out.println("The year is " + year);
        System.out.println("The month is " + month);
        System.out.println("The day of the year is " + dayOfYear);
        System.out.println("The day of the month is " + dayOfMoNTH);
        System.out.println("Th day of the week is " + dayOfWeek);




    }



}

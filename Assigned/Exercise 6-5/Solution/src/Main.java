import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        OffsetDateTime dataNow = OffsetDateTime.now();

        System.out.println("Is data1 before of data2? = " +  data1.isBefore(data2));
        System.out.println("Is data2 after of data1? = " +  data2.isAfter(data1));
        System.out.println("Is data1 equal at now()? = " + data1.isEqual(dataNow));
        System.out.println("Is data2 equal at now()? = " +data2.isEqual(dataNow));


    }
}

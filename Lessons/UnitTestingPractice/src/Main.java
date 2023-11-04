import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class Main {
    public static void main(String[] args) {


    }

    public Integer sum(Integer a, Integer b) {
        if( a == null || b == null) {
            return null;
        }
        return a + b;
    }

    public Integer multiply(Integer a, Integer b) {
        if( a == null || b == null) {
            return null;
        }
        return a*b;
    }
}

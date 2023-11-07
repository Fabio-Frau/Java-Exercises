import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test() {
        String dateToParse = "2023-03-01T13:00:00Z";
        String actual = Main.parseDate(dateToParse);
        String expected = "2023-03-01Z";
        assertEquals(expected,actual);
    }



}
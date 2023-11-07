package Exercise;
import org.junit.jupiter.api.Test;
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import static org.junit.jupiter.api.Assertions.*;
import static Exercise.Main.*;

class MainTest {

    String dateToParse = "2023-03-01T13:00:00Z";
    String pattern = "dd MMMM yyyy";
    OffsetDateTime date = OffsetDateTime.of(2023,3,1,13,0,0,0, ZoneOffset.UTC);

    @Test
    public void testResultConvertingUsingPattern() {
        String expected = "01 marzo 2023";
        String actual = convertUsingOfPattern(date, pattern);
        assertEquals(expected, actual);
    }

    @Test
    public void throwGeneralErrorConvertingUsingPattern() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertUsingOfPattern(date,"fabio"));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Formatting error has occurred", ex.getMessage());
    }

    @Test
    public void throwEmptyPatternErrorConvertingUsingPattern() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertUsingOfPattern(date,""));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Provided pattern is empty and cannot be used to format a date", ex.getMessage());
    }

    @Test
    public void throwBlankPatternErrorConvertinUsingPattern() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertUsingOfPattern(date," "));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Provided pattern is blank and cannot be used to format a date", ex.getMessage());
    }

    @Test
    public void throwNullPatternErrorConvertingUsingPattern() {
        Exception ex = assertThrows(NullPointerException.class, () -> convertUsingOfPattern(date,null));
        assertEquals(NullPointerException.class, ex.getClass());
        assertEquals("Provided pattern is null and cannot be used to format a date", ex.getMessage());
    }

    @Test
    public void throwNullDateErrorConvertingUsingPattern() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertUsingOfPattern(null, pattern));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Passed date is null and cannot be formatted", ex.getMessage());
    }

    @Test
    public void testParseDateResult() {
        OffsetDateTime expected = OffsetDateTime.of(2023,3,1,13,0,0,0, ZoneOffset.UTC);
        OffsetDateTime actual = parseDate(dateToParse);
        assertEquals(expected,actual);
    }

    @Test
    public void testThrowNullErrrorParseDate() {
        Exception ex = assertThrows(DateTimeException.class, () -> parseDate(null));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Passed a null value that cannot be parsed", ex.getMessage());
    }

    @Test
    public void testThrowBlankErrorParseDate() {
        Exception ex = assertThrows(DateTimeException.class, () -> parseDate(" "));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("The passed string is blank and cannot be parsed", ex.getMessage());
    }

    @Test
    public void testThrowEmptyErrorParseDate() {
        Exception ex = assertThrows(DateTimeException.class, () -> parseDate(""));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("The passed string is empty and cannot be parsed", ex.getMessage());
    }

    @Test
    public void testThrowGeneralErrorParseDate() {
        Exception ex = assertThrows(DateTimeException.class, () -> parseDate("FABIO"));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Text cannot be parsed", ex.getMessage());
    }


}
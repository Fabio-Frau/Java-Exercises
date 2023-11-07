package Exercise;
import org.junit.jupiter.api.Test;
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;
import static Exercise.Main.*;


class MainTest {

    String dateToParse = "2023-03-01T13:00:00Z";
    OffsetDateTime date = OffsetDateTime.of(2023,3,1,13,0,0,0,ZoneOffset.UTC);
    Locale localization = Locale.ITALY;
    String pattern = "dd MMMM yyyy";

    @Test
    public void testSubtract1Month() {
        OffsetDateTime expected = OffsetDateTime.of(2023,2,1,13,0,0,0,ZoneOffset.UTC);
        OffsetDateTime actual = subtractMonths(date, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testAdd7Days() {
        OffsetDateTime expected = OffsetDateTime.of(2023,3,8,13,0,0,0,ZoneOffset.UTC);
        OffsetDateTime actual = addDays(date,7);
        assertEquals(expected,actual);
    }

    @Test
    public void testAdd1Years() {
        OffsetDateTime expected = OffsetDateTime.of(2024,3,1,13,0,0,0,ZoneOffset.UTC);
        OffsetDateTime actual = addYears(date,1);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractMonthsZero() {
        OffsetDateTime expected = date;
        OffsetDateTime actual = subtractMonths(date,0);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddYearsZero() {
        OffsetDateTime expected = date;
        OffsetDateTime actual = addYears(date,0);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddDaysZero() {
        OffsetDateTime expected = date;
        OffsetDateTime actual = addDays(date,0);
        assertEquals(expected, actual);
    }

    @Test
    public void throwIllegalArgErrorAddYears() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> addYears(date,-1));
        assertEquals(IllegalArgumentException.class, ex.getClass());
        assertEquals("The value of the years to add must be greater than zero", ex.getMessage());
    }

    @Test
    public void throwNullErrorAddYears() {
        Exception ex = assertThrows(DateTimeException.class, () -> addYears(null,1));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("The passed date is null and cannot add anything", ex.getMessage());
    }

    @Test
    public void throwIllegalArgErrorSubtractMonths() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> subtractMonths(date,-1));
        assertEquals(IllegalArgumentException.class, ex.getClass());
        assertEquals("The value of the months to subtract must be greater than zero", ex.getMessage());
    }

    @Test
    public void throwNullErrorSubtractMonths() {
        Exception ex = assertThrows(DateTimeException.class, () -> subtractMonths(null,1));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("The passed date is null and cannot add anything", ex.getMessage());
    }

    @Test
    public void throwIllegalArgErrorAddDays() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> addDays(date,-7));
        assertEquals(IllegalArgumentException.class, ex.getClass());
        assertEquals("The value of the days to subtract must be greater than zero", ex.getMessage());
    }

    @Test
    public void throwNullErrorAddDays() {
        Exception ex = assertThrows(DateTimeException.class, () -> addDays(null,7));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("The passed date is null and cannot add anything", ex.getMessage());
    }

    @Test
    public void testResultConvertingUsingPattern() {
        String expected = "01 marzo 2023";
        String actual = convertUsingOfPattern(date, pattern,localization);
        assertEquals(expected, actual);
    }

    @Test
    public void throwGeneralErrorConvertingUsingPattern() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertUsingOfPattern(date,"fabio",localization));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Formatting error has occurred", ex.getMessage());
    }

    @Test
    public void throwNullLocalizationErrorConvertingUsingPattern() {
        Exception ex = assertThrows(NullPointerException.class, () -> convertUsingOfPattern(date,pattern,null));
        assertEquals(NullPointerException.class, ex.getClass());
        assertEquals("Provided localization is null and cannot be used to format a date", ex.getMessage());
    }

    @Test
    public void throwEmptyPatternErrorConvertingUsingPattern() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertUsingOfPattern(date,"",localization));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Provided pattern is empty and cannot be used to format a date", ex.getMessage());
    }

    @Test
    public void throwBlankPatternErrorConvertinUsingPattern() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertUsingOfPattern(date," ",localization));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Provided pattern is blank and cannot be used to format a date", ex.getMessage());
    }

    @Test
    public void throwNullPatternErrorConvertingUsingPattern() {
        Exception ex = assertThrows(NullPointerException.class, () -> convertUsingOfPattern(date,null,localization));
        assertEquals(NullPointerException.class, ex.getClass());
        assertEquals("Provided pattern is null and cannot be used to format a date", ex.getMessage());
    }

    @Test
    public void throwNullDateErrorConvertingUsingPattern() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertUsingOfPattern(null, pattern,localization));
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
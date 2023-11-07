package Exercise;

import org.junit.jupiter.api.Test;

import java.time.*;

import static org.junit.jupiter.api.Assertions.*;
import static Exercise.Main.*;


class MainTest {

    String dateToParse = "2023-03-01T13:00:00Z";
    OffsetDateTime date = OffsetDateTime.of(2023,3,1,13,0,0,0,ZoneOffset.UTC);
    OffsetDateTime dateLeapYear = OffsetDateTime.of(2024,3,1,13,0,0,0,ZoneOffset.UTC);

    @Test
    public void throwErrorDayOfWeekFromDate() {
        Exception ex = assertThrows(DateTimeException.class, () -> dayOfWeekFromDate(null));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("The passed date is null and cannot extract the day of the week from it", ex.getMessage());
    }

    @Test
    public void throwErrorDayOfMonthFromDate() {
        Exception ex = assertThrows(DateTimeException.class, () -> dayOfMonthFromDate(null));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("The passed date is null and cannot extract the day of the month from it", ex.getMessage());
    }

    @Test
    public void throwErrorDayOfYearFromDate() {
        Exception ex = assertThrows(DateTimeException.class, () -> dayOfYearFromDate(null));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("The passed date is null and cannot extract the day of the year from it", ex.getMessage());
    }

    @Test
    public void throwErrorMonthValueFromDate() {
        Exception ex = assertThrows(DateTimeException.class, () -> monthValueFromDate(null));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("The passed date is null and cannot extract the month value from it", ex.getMessage());
    }

    @Test
    public void throwErrortMonthFromDate() {
        Exception ex = assertThrows(DateTimeException.class, () -> monthFromDate(null));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("The passed date is null and cannot extract the month from it", ex.getMessage());
    }

    @Test
    public void throwErrorYearFromDate() {
        Exception ex = assertThrows(DateTimeException.class, () -> yearFromDate(null));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("The passed date is null and cannot extract the year from it", ex.getMessage());
    }

    @Test
    public void testDayOfWeekFromDate() {
        DayOfWeek actual = dayOfWeekFromDate(date);
        DayOfWeek expected = DayOfWeek.WEDNESDAY;
        assertEquals(expected,actual);
    }

    @Test
    public void testDayOfMonthFromDate() {
        int actual = dayOfMonthFromDate(date);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testLeapYearDayOfYearFromDate () {
        int actual = dayOfYearFromDate(dateLeapYear);
        int expected = 61;
        assertEquals(expected, actual);
    }

    @Test
    public void testDayOfYearFromDate () {
        int actual = dayOfYearFromDate(date);
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    public void testMonthValueFromDate() {
        int actual = monthValueFromDate(date);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testMonthFromDate() {
        Month actual = monthFromDate(date);
        Month expected = Month.MARCH;
        assertEquals(expected, actual);
    }

    @Test
    public void testYearFromDate() {
        int actual = yearFromDate(date);
        int expected = 2023;
        assertEquals(expected, actual);
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
package Exercise;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.zip.DataFormatException;

import static org.junit.jupiter.api.Assertions.*;
import static Exercise.Main.*;


class MainTest {

    String dateToParse = "2002-03-01T13:00:00Z";

    @Test
    public void testConvertToShortString() {
        OffsetDateTime date = OffsetDateTime.of(2002,3,1,13,0,0,0, ZoneOffset.UTC);
        String expected = "3/1/02";
        String actual = convertToShortString(date);
        assertEquals(expected,actual);
    }

    @Test
    public void testConvertToMediumString() {
        OffsetDateTime date = OffsetDateTime.of(2002,3,1,13,0,0,0, ZoneOffset.UTC);
        String expected = "Mar 1, 2002";
        String actual = convertToMediumString(date);
        assertEquals(expected,actual);
    }

    @Test
    public void testConvertToLongString() {
        OffsetDateTime date = OffsetDateTime.of(2002,3,1,13,0,0,0, ZoneOffset.UTC);
        String expected = "March 1, 2002";
        String actual = convertToLongString(date);
        assertEquals(expected,actual);
    }

    @Test
    public void testConvertToFullString() {
        OffsetDateTime date = OffsetDateTime.of(2002,3,1,13,0,0,0, ZoneOffset.UTC);
        String expected = "Friday, March 1, 2002";
        String actual = convertToFullString(date);
        assertEquals(expected,actual);
    }

    @Test
    public void testParseDateResult() {
        OffsetDateTime expected = OffsetDateTime.of(2002,3,1,13,0,0,0, ZoneOffset.UTC);
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
        assertEquals("General error has occurred" , ex.getMessage());
    }

    @Test
    public void testThrowErrrorConvertFullString() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertToFullString(null));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Passed a null value that cannot be formatted", ex.getMessage());
    }

    @Test
    public void testThrowErrrorConvertLongString() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertToLongString(null));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Passed a null value that cannot be formatted", ex.getMessage());
    }

    @Test
    public void testThrowErrrorConvertMediumString() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertToMediumString(null));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Passed a null value that cannot be formatted", ex.getMessage());
    }

    @Test
    public void testThrowErrrorConvertShortString() {
        Exception ex = assertThrows(DateTimeException.class, () -> convertToShortString(null));
        assertEquals(DateTimeException.class, ex.getClass());
        assertEquals("Passed a null value that cannot be formatted", ex.getMessage());
    }





}
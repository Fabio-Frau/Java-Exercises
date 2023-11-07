import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.*;
import java.util.function.BooleanSupplier;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void whenAssertingArraysEquality_thenEqual() {
        char[] expected = {'J','u','p','i','t','e','r'};
        char[] actual = "Jupiter".toCharArray();

        assertArrayEquals(expected, actual, "Arrays should be equal");
    }

    @Test
    public void whenAssertingEquality_thenEqual() {
        float square = 2 * 2;
        float rectangle = 2 * 2;

        assertEquals(square, rectangle,"floats should be equal");
    }

    @Test
    public void whenAssertingEqualityWithDelta_thenEqual() {
        float square = 2 * 2;
        float rectangle = 3 * 2;
        float delta = 2;
        assertEquals(square, rectangle, delta,"square and rectangle should be equal with a tolerance of delta = " + delta);
    }

    @Test
    public void whenAssertingConditions_thenVerified() {
        assertTrue(5 > 4, "5 is greater than 4");
        assertTrue(null == null, "null is equal to null");
    }

    @Test
    public void givenBooleanSupplier_whenAssertingCondition_thenVerified() {
        BooleanSupplier condition = () -> 5 > 6;

        assertFalse(condition, "5 is not greater than 6");
    }

    @Test
    public void whenAssertingNotNull_thenTrue() {
        Object dog = new Object();

        assertNotNull(dog, "The dog should not be null");
    }

    @Test
    public void whenAssertingNull_thenTrue() {
        Object cat = null;

        assertNull(cat, "The cat should be null");
    }

    @Test
    public void whenAssertingSameObject_thenSuccessfull() {
        String language = "Java";
        Optional<String> optional = Optional.of(language);

        assertSame(language, optional.get());
    }

//    @Test
//    public void whenFailingATest_thenFailed() {
//        //Test not completed
//        fail("FAIL - test not compelted");
//    }



    @Test
    public void givenMultipleAssertion_whenAssertingAll_thenOK() {
        Object obj = null;

        assertAll(
                "heading",
                () -> assertEquals(4, 2 * 2, "4 is 2 times 2" ),
                () -> assertEquals("java", "JAVA".toLowerCase()),
                () -> assertNull(obj, "obj is null")
        );
    }

    @Test
    public void givenTwoLists_whenAssertingIterables_thenEquals() {
        Iterable<String> al = new ArrayList<>(asList("Java","Junit", "Test"));
        Iterable<String> ll = new LinkedList<>(asList("Java","Junit", "Test"));

        assertIterableEquals(al,ll);
    }

    @Test
    public void whenAssertingEqualityListOfStrings_thenEqual() {
        List<String> expected = asList("Java", "\\d+", "Junit");
        List<String> actual = asList("Java", "11", "Junit");

        assertLinesMatch(expected, actual);
    }

    @Test
    public void whenAssertingEquality_thenNotEqual() {
        Integer value = 5;

        assertNotEquals(0, value, "The result cannot be zero");
    }

    @Test
    public void whenAssertingException_thenThrown() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    throw new IllegalArgumentException("Exception message");
                }
        );
        assertEquals("Exception message", exception.getMessage());
    }

    @Test
    public void whenAssertingTimeout_thenNotExceeded() {
        assertTimeout(
                Duration.ofSeconds(2),
                () -> {
                    Thread.sleep(1000);
                }
        );
    }

}
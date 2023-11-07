import org.junit.jupiter.api.Test;

import java.lang.ref.PhantomReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;



class MainTest {

    @Test
    public void whenBigDecimalCreated_thenValueMatches() {
        BigDecimal bdFromString = new BigDecimal("0.1");
        BigDecimal bdFromCharArray = new BigDecimal( new char[] {'3','.','1','6','1','5'});
        BigDecimal bdFromInt = new BigDecimal(42);
        BigDecimal bdFromLong = new BigDecimal(123412345678901L);
        BigInteger bigInteger = BigInteger.probablePrime(100, new Random());
        BigDecimal bdFromBigInteger = new BigDecimal(bigInteger);

        assertEquals("0.1", bdFromString.toString());
        assertEquals("3.1615", bdFromCharArray.toString());
        assertEquals("42", bdFromInt.toString());
        assertEquals("123412345678901", bdFromLong.toString());
        assertEquals(bigInteger.toString(), bdFromBigInteger.toString());
    }

    @Test
    public void whenBigDecimalCreatedFromDouble_thenValueMayNotMatch() {
        BigDecimal bdFromDouble = new BigDecimal(0.1d);
        assertNotEquals("0.1",bdFromDouble.toString());
    }

    @Test
    public void whenBigDecimalCreatedUsingValueOf_thenValueMatches() {
        BigDecimal bdFromLong1 = BigDecimal.valueOf(123412345678901L);
        BigDecimal bdFromLong2 = BigDecimal.valueOf(123412345678901L,2);
        BigDecimal bdFromDouble = BigDecimal.valueOf(0.1d);

        assertEquals("123412345678901", bdFromLong1.toString());
        assertEquals("1234123456789.01",bdFromLong2.toString());
        assertEquals("0.1", bdFromDouble.toString());
    }

    @Test
    public void whenGettingAttributes_thenExpectResult() {
        BigDecimal bd = new BigDecimal("-12345.6789");

        assertEquals(9, bd.precision());
        assertEquals(4, bd.scale());
        assertEquals(-1, bd.signum());
    }

    @Test
    public void whenComparingBigDecimals_thenExpectedResult() {
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("1.00");
        BigDecimal bd3 = new BigDecimal("2.0");

        /*his method ignores the scale while comparing.*/
        assertTrue(bd1.compareTo(bd3) < 0);
        assertTrue(bd3.compareTo(bd1) > 0);
        assertTrue(bd1.compareTo(bd2) == 0);
        assertTrue(bd1.compareTo(bd3) <= 0);
        assertTrue(bd1.compareTo(bd2) >= 0);
        assertTrue(bd1.compareTo(bd3) != 0);
    }

    @Test
    public void whenEqualsCalled_thenSizeAndScaleMatched() {
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("1.00");

        /*the equals method considers two BigDecimal objects as equal
         only if they are equal in value and scale*/
        assertFalse(bd1.equals(bd2));
    }

    @Test
    public void whenPerformingArithmetic_thenExpectedResult() {
        BigDecimal bd1 = new BigDecimal("4.0");
        BigDecimal bd2 = new BigDecimal("2.0");

        BigDecimal sum = bd1.add(bd2);
        BigDecimal difference = bd1.subtract(bd2);
        BigDecimal quotient = bd1.divide(bd2);
        BigDecimal product = bd1.multiply(bd2);

        assertTrue(sum.compareTo(new BigDecimal("6.0")) == 0);
        assertTrue(difference.compareTo(new BigDecimal("2.0")) == 0);
        assertTrue(quotient.compareTo(new BigDecimal("2.0")) == 0);
        assertTrue(product.compareTo(new BigDecimal("8.0")) == 0);
    }

    @Test
    public void whenRoundingDecimal_thenExpectedResult() {
        BigDecimal bd = new BigDecimal("2.5");
        // Round to 1 digit using HALF_EVEN
        BigDecimal rounded = bd .round(new MathContext(1, RoundingMode.HALF_EVEN));

        assertEquals("2", rounded.toString());
    }

    @Test
    public void givenPurchaseTxn_whenCalculatingTotalAmount_thenExpectedResult() {
        BigDecimal quantity = new BigDecimal("4.5");
        BigDecimal unitPrice = new BigDecimal("2.69");
        BigDecimal discountRate = new BigDecimal("0.10");
        BigDecimal taxRate = new BigDecimal("0.0725");

        BigDecimal amountToBePaid = Main.calculateTotalAmount(quantity, unitPrice,
                                        discountRate, taxRate);

        assertEquals("11.68", amountToBePaid.toString());
    }

    @Test
    public void whenBigIntegerCreatedFromConstructor_thenExpectedResult() {
        BigInteger biFromString = new BigInteger("1234567890987654321");
        BigInteger biFromByteArray = new BigInteger( new byte[] {64,64,64,64,64,64});
        BigInteger biFromSignMagnitude = new BigInteger(-1, new byte[] {64,64,64,64,64,64});

        assertEquals("1234567890987654321", biFromString.toString());
        assertEquals("70644700037184", biFromByteArray.toString());
        assertEquals("-70644700037184", biFromSignMagnitude.toString());
    }

    @Test
    public void whenLongConvertedToBigInteger_thenValueMatches() {
        BigInteger bi = BigInteger.valueOf(2305843009213693951L);

        assertEquals("2305843009213693951", bi.toString());
    }

    @Test
    public void givenBigInteger_whenCompared_thenExpectedResult() {
        BigInteger i = new BigInteger("123456789012345678901234567890");
        BigInteger j = new BigInteger("123456789012345678901234567891");
        BigInteger k = new BigInteger("123456789012345678901234567892");

        assertTrue(i.compareTo(i) == 0);
        assertTrue(j.compareTo(i) > 0);
        assertTrue(j.compareTo(k) < 0);
    }

    @Test
    public void givenBigIntegers_whenPerformingArithmetic_thenExpectedResult() {
        BigInteger i = new BigInteger("4");
        BigInteger j = new BigInteger("2");

        BigInteger sum = i.add(j);
        BigInteger difference = i.subtract(j);
        BigInteger quotient = i.divide(j);
        BigInteger product = i.multiply(j);

        assertEquals(new BigInteger("6"), sum);
        assertEquals(new BigInteger("2"), difference);
        assertEquals(new BigInteger("2"), quotient);
        assertEquals(new BigInteger("8"), product);
    }

    @Test
    public void givenBigIntegers_whenPerformingBitOperations_thenExpectedResult() {
        BigInteger i = new BigInteger("17");
        BigInteger j = new BigInteger("7");

        BigInteger and = i.and(j);
        BigInteger or = i.or(j);
        BigInteger not = j.not();
        BigInteger xor = i.xor(j);
        BigInteger andNot = i.andNot(j);
        BigInteger shiftLeft = i.shiftLeft(1);
        BigInteger shiftRight = i.shiftRight(1);

        assertEquals(new BigInteger("1"), and);
        assertEquals(new BigInteger("23"), or);
        assertEquals(new BigInteger("-8"), not);
        assertEquals(new BigInteger("22"), xor);
        assertEquals(new BigInteger("16"), andNot);
        assertEquals(new BigInteger("34"), shiftLeft);
        assertEquals(new BigInteger("8"), shiftRight);
    }

    @Test
    public void givenBigIntegers_whenPerformingBitManipulations_thenExpectedResults() {
        BigInteger i = new BigInteger("1018");

        int bitCount = i.bitCount();
        int bitLength = i.bitLength();
        int getLowestSetBit = i.getLowestSetBit();
        boolean testBit3 = i.testBit(3);
        BigInteger setBit12 = i.setBit(12);
        BigInteger flipBit0 = i.flipBit(0);
        BigInteger clearBit3 = i.clearBit(3);

        assertEquals(8, bitCount);
        assertEquals(10, bitLength);
        assertEquals(1, getLowestSetBit);
        assertEquals(true, testBit3);
        assertEquals(new BigInteger("5114"), setBit12);
        assertEquals(new BigInteger("1019"), flipBit0);
        assertEquals(new BigInteger("1010"), clearBit3);
    }

    @Test
    public void givenBigIntegers_whenModularCalculation_thenExpectedResult() {
        BigInteger i = new BigInteger("31");
        BigInteger j = new BigInteger("24");
        BigInteger k = new BigInteger("16");

        BigInteger gcd = j.gcd(k);
        BigInteger multiplyAndMod = j.multiply(k).mod(i);
        BigInteger modInverse = j.modInverse(i);
        BigInteger modPow = j.modPow(k,i);

        assertEquals(new BigInteger("8"), gcd);
        assertEquals(new BigInteger("12"), multiplyAndMod);
        assertEquals(new BigInteger("22"), modInverse);
        assertEquals(new BigInteger("7"), modPow);
    }

    @Test
    public void givenBigIntegers_whenPrimeOperations_thenExpectedResult() {
        BigInteger i = BigInteger.probablePrime(100, new Random());

        boolean isProbablePrime = i.isProbablePrime(1000);
        assertEquals(true, isProbablePrime);
    }

}
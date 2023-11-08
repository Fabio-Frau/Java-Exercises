import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void whenConditionIsTrue_thenOnlyFirstExpressionIsEvaluated() {
        int exp1= 0, exp2 = 0;
        int result = 12 > 10 ? ++exp1 : ++exp2;

        assertEquals(1, exp1);
        assertEquals(0, exp2);
        assertEquals(1,result);
    }

    @Test
    public void whenConditionIsFalse_thenOnlySecondExpressionIsEvaluated() {
        int exp1 = 0, exp2 = 0;
        int result = 8 > 10 ? ++exp1 : ++exp2;

        assertEquals(0, exp1);
        assertEquals(1, exp2);
        assertEquals(1,result);
    }

}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Cal_3012_DemoTest {

    private static final double DELTA = 1e-9;

    // ---------- addMe ----------
    @Test
    @DisplayName("addMe: adds two positive numbers")
    void addMe_positiveNumbers() {
        assertEquals(5.0, Cal_3012_Demo.addMe(2.0, 3.0), DELTA);
    }

    @Test
    @DisplayName("addMe: adds negative numbers")
    void addMe_negativeNumbers() {
        assertEquals(-5.0, Cal_3012_Demo.addMe(-2.0, -3.0), DELTA);
    }

    @Test
    @DisplayName("addMe: adds with zero")
    void addMe_withZero() {
        assertEquals(2.5, Cal_3012_Demo.addMe(2.5, 0.0), DELTA);
        assertEquals(2.5, Cal_3012_Demo.addMe(0.0, 2.5), DELTA);
    }

    @Test
    @DisplayName("addMe: handles decimals")
    void addMe_decimals() {
        assertEquals(0.3, Cal_3012_Demo.addMe(0.1, 0.2), DELTA);
    }

    // ---------- subMe ----------
    @Test
    @DisplayName("subMe: subtracts two numbers")
    void subMe_basic() {
        assertEquals(2.0, Cal_3012_Demo.subMe(5.0, 3.0), DELTA);
    }

    @Test
    @DisplayName("subMe: returns negative when b > a")
    void subMe_negativeResult() {
        assertEquals(-2.0, Cal_3012_Demo.subMe(3.0, 5.0), DELTA);
    }

    @Test
    @DisplayName("subMe: subtracting zero returns the same value")
    void subMe_zero() {
        assertEquals(7.5, Cal_3012_Demo.subMe(7.5, 0.0), DELTA);
    }

    @Test
    @DisplayName("subMe: subtracting from itself returns zero")
    void subMe_self() {
        assertEquals(0.0, Cal_3012_Demo.subMe(4.2, 4.2), DELTA);
    }

    // ---------- mulMe ----------
    @Test
    @DisplayName("mulMe: multiplies two positive numbers")
    void mulMe_positive() {
        assertEquals(15.0, Cal_3012_Demo.mulMe(3.0, 5.0), DELTA);
    }

    @Test
    @DisplayName("mulMe: multiplying by zero returns zero")
    void mulMe_zero() {
        assertEquals(0.0, Cal_3012_Demo.mulMe(123.45, 0.0), DELTA);
    }

    @Test
    @DisplayName("mulMe: negative times positive is negative")
    void mulMe_negative() {
        assertEquals(-15.0, Cal_3012_Demo.mulMe(-3.0, 5.0), DELTA);
    }

    @Test
    @DisplayName("mulMe: negative times negative is positive")
    void mulMe_twoNegatives() {
        assertEquals(15.0, Cal_3012_Demo.mulMe(-3.0, -5.0), DELTA);
    }

    // ---------- divMe ----------
    @Test
    @DisplayName("divMe: divides two numbers")
    void divMe_basic() {
        assertEquals(2.0, Cal_3012_Demo.divMe(10.0, 5.0), DELTA);
    }

    @Test
    @DisplayName("divMe: returns decimal result")
    void divMe_decimal() {
        assertEquals(2.5, Cal_3012_Demo.divMe(5.0, 2.0), DELTA);
    }

    @Test
    @DisplayName("divMe: division by zero returns 0")
    void divMe_byZero() {
        assertEquals(0.0, Cal_3012_Demo.divMe(10.0, 0.0), DELTA);
    }

    @Test
    @DisplayName("divMe: zero divided by non-zero is zero")
    void divMe_zeroNumerator() {
        assertEquals(0.0, Cal_3012_Demo.divMe(0.0, 5.0), DELTA);
    }

    @Test
    @DisplayName("divMe: negative division")
    void divMe_negative() {
        assertEquals(-2.0, Cal_3012_Demo.divMe(-10.0, 5.0), DELTA);
    }

    // ---------- Parameterized examples ----------
    @ParameterizedTest
    @CsvSource({
            "1.0, 1.0, 2.0",
            "0.0, 0.0, 0.0",
            "-1.0, 1.0, 0.0",
            "100.5, 0.5, 101.0"
    })
    @DisplayName("addMe: parameterized cases")
    void addMe_parameterized(double a, double b, double expected) {
        assertEquals(expected, Cal_3012_Demo.addMe(a, b), DELTA);
    }

    @ParameterizedTest
    @CsvSource({
            "10.0, 2.0, 5.0",
            "9.0, 3.0, 3.0",
            "1.0, 0.0, 0.0",   // division by zero -> 0
            "-6.0, 3.0, -2.0"
    })
    @DisplayName("divMe: parameterized cases")
    void divMe_parameterized(double a, double b, double expected) {
        assertEquals(expected, Cal_3012_Demo.divMe(a, b), DELTA);
    }
}
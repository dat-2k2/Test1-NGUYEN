package edu.hsai.autotests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultLongTests extends CalculatorTest {
    @ParameterizedTest
    @CsvSource({"1, 1, 1", "-3, 3, -9", "2, -5, -10", "-5, -6, 30"})
    void shouldSignAligned(long number, long b, long expected) {
        assertEquals(expected, calculator.mult(number, b));
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 6", "1, 3, 3"})
    void shouldBeCommutative(long a, long b, long expected) {
        assertEquals(calculator.mult(b, a), calculator.mult(a, b), expected);
    }

    @ParameterizedTest
    @CsvSource({"100, 0, 0", "0, -100, 0"})
    void shouldAbsorbZero(long number) {
        assertEquals(0, calculator.mult(number, 0));
    }

    @ParameterizedTest
    @ValueSource(longs = {20, 99})
    void shouldReflectOne(long number) {
        assertEquals(number, calculator.mult(number, 1));
    }
}

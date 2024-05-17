package edu.hsai.autotests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTests extends CalculatorTest {
    @ParameterizedTest
    @ValueSource(longs = {-1, Long.MIN_VALUE, -200000})
    void shouldRejectNegative(long val) {
        Assertions.assertFalse(calculator.isPositive(val));
    }

    @ParameterizedTest
    @ValueSource(longs = {1, Long.MAX_VALUE, 10000})
    void shouldAcceptPositive(long val) {
        Assertions.assertTrue(calculator.isPositive(val));
    }

    @Test
    void shouldRejectZero() {
        Assertions.assertFalse(calculator.isPositive(0));
    }
}

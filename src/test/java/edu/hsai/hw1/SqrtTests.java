package edu.hsai.hw1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtTests extends CalculatorTest {
    @ParameterizedTest
    @CsvSource({"9, 3", "10000, 100", "1, 1", "0, 0"})
    public void shouldBeIntegerForSquareNumber(double number, double expected) {
        assertEquals(expected, calculator.sqrt(number), DELTA);
    }

    @ParameterizedTest
    @ValueSource(doubles = {6.25, 1.49, 2.25})
    public void shouldEqualSquare(double number) {
        assertEquals(number, calculator.sqrt(number)*calculator.sqrt(number), DELTA);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-1., -2.3, -10e6})
    public void shouldProduceNanWithNegativeNumber(double number) {
        assertEquals(Double.NaN, calculator.sqrt(number), DELTA);
    }

}

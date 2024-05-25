package edu.hsai.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CtgTests extends CalculatorTest {
    private static final double EPSILON = 1.e-5;

    private static Stream<Arguments> predefined() {
        return Stream.of(
                arguments(Math.PI / 6, Math.sqrt(3.)),
                arguments(Math.PI / 4, 1.),
                arguments(Math.PI / 3, Math.sqrt(3.)/3),
                arguments(Math.PI / 2, 0.),
                arguments(3* Math.PI / 2, 0.)
        );
    }

    @ParameterizedTest
    @MethodSource("predefined")
    public void shouldAsBeWritten(double val, double expected) {
        Assertions.assertEquals(expected, calculator.ctg(val), DELTA);
        Assertions.assertEquals(-expected, calculator.ctg(val + Math.PI), DELTA);
        Assertions.assertEquals(-expected, calculator.ctg(val - Math.PI), DELTA);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI, -Math.PI, 2*Math.PI})
    public void shouldReturnInfinity(double val) {
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.ctg(val + EPSILON), DELTA);
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, calculator.ctg(val - EPSILON), DELTA);
    }
}

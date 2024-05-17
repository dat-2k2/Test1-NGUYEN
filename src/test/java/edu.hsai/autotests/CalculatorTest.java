package edu.hsai.autotests;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorTest {
    protected static final double DELTA = 0.1;
    protected static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }
}

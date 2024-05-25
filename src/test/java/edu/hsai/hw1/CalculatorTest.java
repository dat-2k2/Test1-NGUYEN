package edu.hsai.hw1;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorTest {
    protected static Calculator calculator;
    protected static final double DELTA = 0.1;
    @BeforeAll
    public static void init(){
        calculator = new Calculator();
    }
}

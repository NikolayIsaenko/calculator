package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.exсeption.DivideByZeroExсeption;
import pro.sky.calculator.service.impl.CalculatorServiceImpl;


public class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldCorrectlyCalculateSumm() {
        int num1 = 10;
        int num2 = 20;
        int expectedResult = 30;

        Integer actualResult = calculatorService.plus(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldCorrectlyCalculateMinus() {
        int num1 = 30;
        int num2 = 20;
        int expectedResult = 10;

        Integer actualResult = calculatorService.minus(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldCorrectlyCalculateMultiply() {
        int num1 = 3;
        int num2 = 2;
        int expectedResult = 6;

        Integer actualResult = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldCorrectlyCalculateDivide() {
        int num1 = 6;
        int num2 = 3;
        int expectedResult = 2;

        Integer actualResult = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldThrowExeptionWhenDivideByZero() {
        int num1 = 10;
        int num2 = 0;
        Assertions.assertThrows(DivideByZeroExсeption.class, () -> calculatorService.divide(num1, num2));
    }
}

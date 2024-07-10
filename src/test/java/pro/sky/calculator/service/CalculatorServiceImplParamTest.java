package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.service.impl.CalculatorServiceImpl;

import java.util.stream.Stream;

public class CalculatorServiceImplParamTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(10, 20),
                Arguments.of(0, 5),
                Arguments.of(100, 50),
                Arguments.of(13, -75)

        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    public void shouldCorrectlyCalculateSum(Integer num1, Integer num2) {
        int expectedResult = num1 + num2;
        Integer actualResult = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideArguments")
    public void shouldCorrectlyCalculateMinus(Integer num1, Integer num2) {
        int expectedResult = num1 - num2;
        Integer actualResult = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideArguments")
    public void shouldCorrectlyCalculateMultiply(Integer num1, Integer num2) {
        int expectedResult = num1 * num2;
        Integer actualResult = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideArguments")
    public void shouldCorrectlyCalculateDivide(Integer num1, Integer num2) {
        int expectedResult = num1 / num2;
        Integer actualResult = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}

package pro.sky.calculator.exeption;

public class DivideByZeroExeption extends IllegalArgumentException {
    public DivideByZeroExeption(String s) {
        super(s);
    }
}

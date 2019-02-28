package Day6.home.endava.calculator.src.main;

public class BasicCalculatorImpl implements BasicCalculator {


    @Override
    public Long add(Integer... array) throws NumberFormatException {
        Long sum = 0L;

        for (Integer number : array) {
            sum += number;
        }

        return sum;
    }

    @Override
    public Long add(Long a, Long b) {
        return a + b;
    }

    @Override
    public Double addDouble(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double subtract(Double a, Double b) {
        return a - b;
    }

    public Double divide(Double a, Double b) {
        return a / b;
    }
}


package main;

public class ExpertCalculatorImpl extends BasicCalculatorImpl implements ExpertCalculator {
    @Override
    public Long pow(Integer x, Integer n) {

        Long result = 1L;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }

    @Override
    public Integer root(Integer x, Integer n) {
        return null;
    }

    @Override
    public Long factorial(Integer n) {

        if (n == 0 || n == 1) {
            return 1L;
        } else {
            return factorial(n - 1) * n;
        }
    }

    @Override
    public Double evaluate(String expression) {

        Double result = null;

        operatorIterator:
        for (Operator operator : Operator.getValues()) {
            String[] operands = expression.split(operator.getSign(), 2);

            Double leftOperand = evaluate(operands[0]);
            Double rightOperand = evaluate(operands[1]);

            switch (operator) {
                case ADD: {
                    result = addDouble(leftOperand, rightOperand);
                    break operatorIterator;
                }
                case SUBTRACT: {
                    result = subtract(leftOperand, rightOperand);
                    break operatorIterator;
                }
                case MULTIPLY: {
                    result = multiply(leftOperand, rightOperand);
                    break operatorIterator;
                }
                case DIVIDE: {
                    result = divide(leftOperand, rightOperand);
                    break operatorIterator;
                }


                case PARANTESIS:
                    Double resultExpression = evaluateAritmeticSighn(expression, operator);
                    result = evaluate(String.valueOf(resultExpression));
                    break operatorIterator;
            }


            if (operands.length == 1) {
                continue;
            }
        }
        if (result == null) {
            return Double.valueOf(expression);
        } else {
            return result;
        }
    }


    private Double evaluateAritmeticSighn(String expression, Operator operator) {

        String[] operands = expression.split(operator.getSign(), 2);

        if (operands.length == 1) {
            return null;
        }

        Double result = null;

        Double leftOperand = evaluate(operands[0]);
        Double rightOperand = evaluate(operands[1]);

        switch (operator) {
            case ADD:
                return addDouble(leftOperand, rightOperand);
            case SUBTRACT:
                return subtract(leftOperand, rightOperand);
            case DIVIDE:
                return divide(leftOperand, rightOperand);
            case MULTIPLY:
                return multiply(leftOperand, rightOperand);
        }

        return result;


    }

    private String evaluateMultiplySign(String expression, Operator operator) {
        int startIndex = expression.indexOf(operator.getStartSign());
        int endIndex = expression.indexOf(operator.getEndSign());

        String newExpression = expression.substring(startIndex + 1, endIndex);
        Double result = evaluate(newExpression);

        return expression.substring(0, startIndex) + result + expression.substring(endIndex + 1);
    }

}


import main.BasicCalculator;
import main.BasicCalculatorImpl;
import main.ExpertCalculator;
import main.ExpertCalculatorImpl;

import java.text.DecimalFormat;

public class TestCalculator {

    public static void main(String[] args) {

        DecimalFormat formaterValue = new DecimalFormat("#,###.00");

        ExpertCalculator ex = new ExpertCalculatorImpl();


        BasicCalculator basicCalculator = new BasicCalculatorImpl();
        System.out.println(formaterValue.format(basicCalculator.add(250, 2500)));

        ExpertCalculatorImpl a = new ExpertCalculatorImpl();
        System.out.println(a.pow(2, 3));
        System.out.println(a.factorial(4));


        System.out.println(ex.evaluate("2-5"));
        System.out.println(ex.evaluate("4-3"));
        System.out.println(ex.evaluate("2+3+4"));
        System.out.println(ex.evaluate("2*3-4"));

    }
}

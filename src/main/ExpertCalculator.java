package main;

public interface ExpertCalculator extends BasicCalculator {

    public Long pow(Integer x , Integer n);

    public Integer root(Integer x, Integer n);

    public Long factorial(Integer n);

    public Double evaluate(String expression);
}

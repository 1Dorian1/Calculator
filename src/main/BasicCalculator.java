package main;

public interface BasicCalculator {  //contract

    //declar interfata cu interface ,implementarea fara sau invers
    public Long add(Integer... array);

    //overload cu param de tip long
    public Long add(Long a, Long b);

    public Double addDouble(Double a, Double b);

    public Double multiply(Double a, Double b);

    public Double subtract(Double a , Double b);

    public Double divide(Double a, Double b);

}

package Day6.home.endava.calculator;

public enum Operator {

    ADD("\\+"),
    SUBTRACT("\\-"),
    MULTIPLY("\\*"),
    DIVIDE("\\/"),
    PARANTESIS("(",")");

    private String sign;
    private String startSign;
    private String endSign;


    Operator(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public static Operator[] getValues() {
        return new Operator[]{ADD, SUBTRACT, MULTIPLY, DIVIDE};
    }

    private Operator(String startSign, String endSign) {
        this.startSign = startSign;
        this.endSign = endSign;
    }

    public String getStartSign() {
        return startSign;
    }

    public String getEndSign() {
        return endSign;
    }

}

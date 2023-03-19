public class Calculator {
    private double NumberOne;
    private double NumberTwo;

    public Calculator(double numberOne, double numberTwo) {
        NumberOne = numberOne;
        NumberTwo = numberTwo;
    }

    public double Sum(){
        return NumberOne + NumberTwo;
    }

    public double Subtract(){
        return NumberOne - NumberTwo;
    }

    public double Divide(){
        return NumberOne / NumberTwo;
    }

    public double Multiple(){
        return NumberOne * NumberTwo;
    }
}
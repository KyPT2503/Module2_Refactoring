public class Calculator {

    public static final String ADDITION = "+";
    public static final String SUBSTRACTION = "-";
    public static final String MUTIPLICATION = "*";
    public static final String DIVISION = "/";

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBSTRACTION:
                return firstOperand - secondOperand;
            case MUTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
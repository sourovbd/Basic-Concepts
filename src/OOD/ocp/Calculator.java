package OOD.ocp;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation calculatorOperation) {
        if (calculatorOperation == null) {
            throw new InvalidParameterException("Can't perform operation.");
        }
        calculatorOperation.perform();
    }
}

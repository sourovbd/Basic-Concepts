package OOD.ocp;

public class OCPDemo {
    public static void main(String[] args) {

        CalculatorOperation calculatorOperation = new Subtraction(2,3);

        Calculator calculator = new Calculator();
        calculator.calculate(calculatorOperation);

//        CalculatorOperation subtraction = new Subtraction(5,3);
//        calculator.calculate(subtraction);
//
//        CalculatorOperation multiplicaiton = new Multiplicaiton(2,3);
//        calculator.calculate(multiplicaiton);


    }
}

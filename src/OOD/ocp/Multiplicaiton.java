package OOD.ocp;

public class Multiplicaiton implements CalculatorOperation{
    private double left;
    private double right;
    private double result;

    public Multiplicaiton(double left, double right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public void perform() {
        result = left * right;
        System.out.println("Result: " + result);
    }
}

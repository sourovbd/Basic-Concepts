package design.principal.ocp;

public class Addition implements CalculatorOperation {
    private double left;
    private double right;
    private double addition;

    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public void perform() {
        addition = left + right;
        System.out.println("addition: " + addition);
    }
}

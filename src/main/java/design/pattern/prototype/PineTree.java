package design.pattern.prototype;

public class PineTree extends Tree{
    private double mass;
    private double height;
    private double position;

    public double getHeight() {
        return height;
    }

    public double getMass() {
        return mass;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }


    public PineTree(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    @Override
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
    }

    @Override
    public String toString() {
        return "PineTree{" +
                "mass=" + mass +
                ", height=" + height +
                ", position=" + position +
                '}';
    }
}

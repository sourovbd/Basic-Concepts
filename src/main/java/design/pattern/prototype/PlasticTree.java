package design.pattern.prototype;

public class PlasticTree extends Tree{

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


    public PlasticTree(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    @Override
    public Tree copy() {
        PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
        plasticTreeClone.setPosition(this.getPosition());
        return plasticTreeClone;
    }

    @Override
    public String toString() {
        return "PlasticTree{" +
                "mass=" + mass +
                ", height=" + height +
                ", position=" + position +
                '}';
    }
}


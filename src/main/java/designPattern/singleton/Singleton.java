package designPattern.singleton;

public class Singleton {
    private static Singleton instance = null;
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private Singleton() {
        System.out.println("One object is created.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{}";
    }

    public static void main(String[] args) {

    }
}
package designPattern.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setInfo("Hi");
        System.out.println(singleton.getInfo());
        System.out.println(Singleton.getInstance().getInfo());
        System.out.println(Singleton.getInstance().getInfo());
        System.out.println(Singleton.getInstance().getInfo());
    }
}

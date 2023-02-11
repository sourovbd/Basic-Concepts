package design.pattern.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Observable observable = new Observable();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        observable.attach(observer1);
        observable.attach(observer2);

        observable.notifyObservers("Hello World!");

        System.out.println();
        Observer observer3 = new ConcreteObserver("Observer 3");
        observable.attach(observer3);
        observable.notifyObservers("Hello World!");

        System.out.println();
        observable.detach(observer1);
        observable.notifyObservers("Hi World!");
    }
}

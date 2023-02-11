package object.oriented.encapsulation;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("Current balance: "+account.getBalance());
        account.deposit(10);
        account.withDraw(5);
        account.withDraw(5);
        account.withDraw(5);

    }
}

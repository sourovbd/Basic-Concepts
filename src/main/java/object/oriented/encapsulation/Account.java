package object.oriented.encapsulation;

public class Account {
    private double balance = 0;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount+" is deposited successfully!. Current balance is: "+balance);
        } else {
            System.out.println("Deposit is not possible for negative amount.");
        }
    }

    public void withDraw(double amount) {

        if (amount > 0 ) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount+" is withdrawn successfully!. Current balance is: "+balance);
            } else {
                System.out.println("Amount is less than balance. So transaction is not possible.");
            }
        } else {
            System.out.println("Withdraw is not possible for negative amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
}

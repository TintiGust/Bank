package bank;

public class Main {

    public static void main(String[] args) {

    BankAccount account1 = new BankAccount(20);
    SavingAccount account2 = new SavingAccount();
    PayableAccount account3 = new PayableAccount();

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        account1.deposit(250);
        account2.deposit(100);
        account3.deposit(200);

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        account2.calculInterestRate();

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

    }

}

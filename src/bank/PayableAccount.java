package bank;

public class PayableAccount extends BankAccount {

    private int operationFees = 5;

    PayableAccount(int initBalance){
        super(initBalance);
    }
    PayableAccount(){
        super();
    }

    @Override
    protected void deposit(int value) {
        this.balance += Math.abs(value) - operationFees;
    }

    @Override
    protected void withDraw(int value) {
        this.balance -= Math.abs(value) + operationFees;
    }
}

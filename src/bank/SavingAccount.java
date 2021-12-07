package bank;

public class SavingAccount extends BankAccount {
    float interestRate;

    SavingAccount(int initBalance){
        super(initBalance);
        this.interestRate = 6f;
    }

    SavingAccount(){
        this.interestRate = 6f;
    }

    public void calculInterestRate(){
        this.balance += this.balance * this.interestRate / 100;
    }
}

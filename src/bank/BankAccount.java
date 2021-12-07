package bank;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {
    private static final AtomicInteger count = new AtomicInteger(0);
    protected final int id;
    protected float balance;

    BankAccount(int initBalance){
        this.balance = initBalance;
        this.id = count.incrementAndGet();
    }
    BankAccount(){
        this.balance = 0;
        this.id = count.incrementAndGet();
    }

    protected void deposit (int value){
        this.balance += value;
    }

    protected void withDraw(int value){
        this.balance -= value;
    }

    public String toString(){
        return "Account n" + this.id + " with balance " + this.balance;
    }
    protected float seeBalance(){
        return this.balance;
    }

}

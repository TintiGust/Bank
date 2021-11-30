package fr.training.BankingSystem;

public class Account {

    public String id;
    public int amount;
    public


    Account(String id){
        this.id = id;
    }

    public void deposit(float transferAmount){ // faire un dépot sur le compte
        amount +=transferAmount;
    }
    public void withdraw(float transferAmount){ // faire un retrait sur le compte

    }
    public float getAmount(){ // obtenir la valeur du solde

    }
    public void showAmount(){ // afficher le solde

    }
    public void transfer (float transferAmount, Account destinataire){
        withdraw(transferAmount);
        destinataire.deposit(transferAmount);
    }


}

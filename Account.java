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
/* demande d'explication
la ligne 26 définit une variable destinataire de type Account ?, donc lorsque un objet Account sera instancié, j'aurais un objet Account dans destinataire ?
la ligne 28 apelle la fonction déposit avec parametre transferAmount,
ainsi, je comprend avec cette syntaxe que j'apelle la procédure deposit pour modifier la var Amount de mon objet destinataire de type Account (comme si j'apellais déposit
dans mon objet actuel, pour modifier son atribut Amount qui possède sa valeur unique)
est ce que je vois bien la chose ?

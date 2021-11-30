package fr.training.BankingSystem;

import java.util.UUID;

public class Client {


    private Account[] myAccounts = new Account[10];
    private String name;
    int nbAccount = myAccounts.length;

    public Client(String clientName){
        this.name = clientName;
        this.addAccount();
    }

    public String getName(Client client){
        return client.name;
    }

    public float getAmount(){
        return this.myAccounts[0].getAmount();
    }

    public void showAmount(){
        for(int i=0; i<myAccounts.length; i++ )
        this.myAccounts[i].showAmount();
    }

    public void addAccount(){
        this.myAccounts[nbAccount] =  new Account(randUuid());      // si l'array est définit avec 10, alors un length me donneras 10 ? donc pas possible de faire this.myAccounts[myAccounts.length] ????

    }
    public String randUuid(){
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString(); // impossible de faire return String uuidAsString = uuid.toString(); ???
        return uuidAsString;
    }
}

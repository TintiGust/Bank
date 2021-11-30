package fr.training.BankingSystem;

import java.util.UUID;

public class Client {

    UUID uuid = UUID.randomUUID();
    String uuidAsString = uuid.toString();
    private Account[] myAccounts = new Account[10];
    private String name;

    public Client(String clientName){
        this.name = clientName;
        this.myAccounts[myAccounts.length] =  new Account(uuidAsString);      // si l'array est définit avec 10, alors un length me donneras 10 ? donc pas possible de faire this.myAccounts[myAccounts.length] ????
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
}

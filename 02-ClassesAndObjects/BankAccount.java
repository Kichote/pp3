//Punkt 13

public class BankAccount
{
    //5 atrybutów
    String accountNumber ;
    String accountHolderName ;
    String nameOfBank ;
    int dateOfAccountCreation;
    int balance ;
    
    //3 metody
    
    void displayNumber() {
        System.out.println(accountNumber);
    }
    
    void displayHolderName() {
        System.out.println(accountHolderName);
    }
    
    void displayBalance() {
        System.out.println(balance);
    }
}

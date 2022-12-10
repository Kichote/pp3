

public class BankAccount
{
    int balance;
    
    public void deposit(int deposit) {
        balance += deposit;
    }
    
    public void withdraw(int withdraw) {
        if(balance < withdraw) {
            System.out.print("Withdrawal amount is bigger than account balance!");
        }else if(withdraw > 500) {
            System.out.print("You cannot withdraw more than 500 at one time!");
        }else {
            balance -= withdraw;
        }
    }
    
    public int display() {
        return balance;
    }
}

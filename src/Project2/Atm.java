package Project2;

public class Atm {
    private static BankAccount account;

    public Atm(BankAccount account){
        this.account=account;
    }
    //withdrawn Money
    public static void withdraw(double amount){
        if(amount>account.getBalance())
        {
            System.out.println("Insufficient funds"+amount);
        }
        else{
            account.setBalance(account.getBalance()-amount);
            System.out.println("Sucessfully withdrawn:"+amount);
        }
    }

    //Deposit

    public static void deposit(double amount){
        account.setBalance(account.getBalance()+amount);
        System.out.println("Sucessfully deposited"+amount);
    }

    public static void checkBalance(){
        System.out.println("Current Balance"+account.getBalance());
    }


}
class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

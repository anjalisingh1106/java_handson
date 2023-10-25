package OOPS;

class Account {
    private String name;
    private double balance;

    public Account(String name,double balance){
        this.name=name;
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }
}

class SavingsAccount extends Account{
    private double fixedDeposit;
    
    public SavingsAccount(String name,double balance,double fixedDeposit){
        super(name,balance);
        this.fixedDeposit=fixedDeposit;
    }
    public double getBalance(){
        return super.getBalance()+fixedDeposit;
    }
}

class CurrentAccount extends Account{
    private double cashCredit;
    
    public CurrentAccount(String name,double balance,double cashCredit){
        super(name,balance);
        this.cashCredit=cashCredit;
    }
    public double calculate(){
        return super.getBalance()+cashCredit;
    }
}


public class Bank {
    public static void main(String[] args){
        Account[] accounts = new Account[3];
        accounts[0]= new SavingsAccount("S1",40000,10000);
        accounts[1]= new CurrentAccount("C1", 60000, 30000);
        accounts[2]= new SavingsAccount("S2", 80000, 40000);
        double total=0;
        for(Account a:accounts){
            total+=a.getBalance();
        }
        System.out.println(total);
    }
}

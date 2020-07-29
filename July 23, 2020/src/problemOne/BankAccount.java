package problemOne;

public class BankAccount {
    String name;
    int ID;
    double balance;

    public BankAccount(String name, int ID, double balance)
    {
        this.name=name;
        this.ID=ID;
        this.balance=balance;
    }


    void deposit(double depAmount)
    {
        balance+=depAmount;
    }

    void withdraw(double withAmount)
    {
        if(balance>withAmount)
        {
            balance-=withAmount;
        }
        else
            System.out.println("Insufficient balance");
    }

    double getBalance()
    {
        return balance;
    }


    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        System.out.println("Balance: "+balance);
    }
}

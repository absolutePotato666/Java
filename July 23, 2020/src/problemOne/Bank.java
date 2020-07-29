package problemOne;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter ID, name and balance\n");

        int id=scan.nextInt();
        String name=scan.next();
        double balance=scan.nextDouble();

        BankAccount user1= new BankAccount(name,id,balance);

        while (true)
        {
            System.out.println("Choose an operation:\n(1) Deposit\n(2)Withdraw\n(3) Display Account Status\n(0) Exit");

            int input=scan.nextInt();

            if (input==1)
            {
                System.out.println("Deposit amount: ");
                double amount=scan.nextDouble();
                user1.deposit(amount);
            }
            else if (input==2)
            {
                System.out.println("Withdrawal amount: ");
                double amount=scan.nextDouble();
                user1.withdraw(amount);
            }
            else if (input==3)
                user1.display();
            else
                System.exit(0);
        }

    }
}

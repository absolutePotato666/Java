package problemTwo;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args)
    {

        problemTwo.BankAccount Users[]=new problemTwo.BankAccount[10];

        Scanner scan= new Scanner(System.in);

        int count=0,id, index;

        while (true)
        {
            System.out.println("Choose an operation:\n (0) Create account \n (1) Deposit\n (2) " +
                    "Withdraw\n (3) Display Account Status\n" + " (5) Exit");

            int input=scan.nextInt();

            if(input==0)
                count=createAccount(Users,count);

            else if (input==1)
            {
                System.out.println("Enter ID: ");
                id=scan.nextInt();
                index=findID(Users,id,count);
                if(index!=-1)
                {
                    System.out.println("Deposit amount: ");
                    double amount = scan.nextDouble();
                    Users[index].deposit(amount);
                }
            }

            else if (input==2)
            {
                System.out.println("Enter ID: ");
                id=scan.nextInt();
                index=findID(Users,id,count);
                if(index!=-1)
                {
                    System.out.println("Withdraw amount: ");
                    double amount = scan.nextDouble();
                    Users[index].withdraw(amount);
                }
            }

            else if (input==3){
                System.out.println("Enter ID: ");
                id=scan.nextInt();
                index=findID(Users,id,count);
                if(index!=-1) Users[index].display();
            }
            else
                System.exit(0);
        }

    }
    public static int createAccount(BankAccount[] Users, int count)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter ID,name and balance:");

        int id=scan.nextInt();
        scan.nextLine();
        String name=scan.nextLine();
        double balance=scan.nextDouble();

        Users[count]= new BankAccount(name,id,balance);
        System.out.println("Account creation complete");
        return count++;

    }
    public static int findID(BankAccount[] Users, int id,int count)
    {

        int i, r = -1;
        for(i=0;i<=count;i++) {
            if(Users[i].ID==id) r=i;

        }
        if(r==-1) System.out.println("Invalid ID");
        return r;
    }
}

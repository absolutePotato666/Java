package problem1;

/**
 * Created by Nahiyan on 21/07/2020.
 */

import java.util.Scanner;


public class BookStoreApp {

    public static void main(String [] args){
        BookStore bs = new BookStore();

//        bs.books[0] = new Book("Himu","Humayun Ahmed",
//                "124578965",4);
//
//        bs.books[1] = new Book("Himur Moddhodupur","Humayun Ahmed",
//                "724545665",8);
//        bs.books[2] = new Book("Ruhan Ruhan","Jafor Iqbal",
//                "145236987",5);
//        bs.books[3] = new Book("Shesher Kobita","Robi Thakur",
//                "845896321",10);
//
//        bs.display();
//        bs.sell("Shesher Kobita",3);
//        bs.display();
//        // existing
//        bs.order("Ruhan Ruhan","Jafor Iqbal",
//                "145236987",2);
//        // new
//        bs.order("Heart of the world","Kazi Nazrul Islam",
//                "987456321",7);

        int option;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter your option number");
            System.out.println("Option 1 - display");
            System.out.println("Option 2 - order");
            System.out.println("Option 3 - sell");
            System.out.println("Option 0 - exit");

            option = sc.nextInt();
            sc.nextLine(); // for enter
            if(option==1){ // display
                bs.display();

            }
            else if(option ==2){ // order
                String title = sc.nextLine();

                System.out.println("Title:"+title);
                String author = sc.nextLine();

                System.out.println("Author"+author);
                String isbn = sc.nextLine();

                System.out.println("ISBN:"+isbn);
                int numOfCopies = sc.nextInt();
                sc.nextLine();
                System.out.println(numOfCopies);
                bs.order(title,author,isbn,numOfCopies);

            }
            else if(option==3){ // sell
                String title = sc.nextLine();

                int numOfCopies = sc.nextInt();
                sc.nextLine();
                bs.sell(title,numOfCopies);
            }
            else if(option==0){
                break;
            }

        }

    }
}

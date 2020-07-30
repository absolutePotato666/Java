package problem1;

/**
 * Created by Nahiyan on 21/07/2020.
 */
public class BookStore {

    // int [] a = new int[10];

    Book[] books; // = new Book[10];
    int maxSize;
    int currentSize;

    BookStore(){
        maxSize =10;
        currentSize=0;
        books = new Book[maxSize];

    }

    void sell(String sellBookTitle,int sellNumOfCopies){
        int flag = 0;
        for(int i=0 ;i<currentSize;i++){
            if(books[i].bookTitle.equals(sellBookTitle)){
                flag=1;
                if(books[i].numOfCopies>=sellNumOfCopies){
                    books[i].numOfCopies -= sellNumOfCopies;
                }
                else{
                    System.out.println("Book found but insufficient number of copies.");
                    System.out.println("Avalable copies:"+books[i].numOfCopies);
                }
            }
        }
        if(flag==0){
            System.out.println("Book not found");
        }
    }
    void order(String title, String author, String isbn, int orderNumOfCopies){
        int flag = 0;
        for (int i=0 ;i<currentSize;i++){

            if( books[i].bookTitle.compareTo(title)==0){
                flag =1;
                books[i].numOfCopies+=orderNumOfCopies;
            }
        }
        if(flag == 0){
            if(currentSize<maxSize){
                currentSize++;
                books[currentSize-1] = new Book(title,author,isbn,orderNumOfCopies);
            }
        }
    }
    void display(){
        for(int i =0 ; i<currentSize ;i++){
            books[i].display();
        }
    }

//    public static void main(){ // for testing
//        books[0] = new Book("Himu","Humayun Ahmed",
//                "124578965",4);
//
//        books[1] = new Book("Himur Moddhodupur","Humayun Ahmed",
//                "724545665",8);
//        books[2] = new Book("Ruhan Ruhan","Jafor Iqbal",
//                "145236987",5);
//        books[3] = new Book("Shesher Kobita","Robi Thakur",
//                "845896321",10);
//
//        display();
//        //sell();
//
//    }
}

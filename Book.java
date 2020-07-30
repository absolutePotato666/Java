package problem1;

/**
 * Created by Nahiyan on 21/07/2020.
 */
public class Book {
    String bookTitle;
    String bookAuthor;
    String bookISBN;
    int numOfCopies; // camel case

    Book(String bookTitle, String bookAuthor, String bookISBN, int numOfCopies){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor ;
        this.bookISBN = bookISBN;
        this.numOfCopies = numOfCopies;
    }

    void display(){

        System.out.println(bookTitle+" - "+bookAuthor + " - "
                + bookISBN + " - " + numOfCopies);
    }
}

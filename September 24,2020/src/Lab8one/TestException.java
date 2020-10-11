package Lab8one;
import java.util.*;

public class TestException {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        try {
            System.out.println("Enter 2 integers.");
            int a = scan.nextInt();
            int b = Integer.parseInt(scan.next().trim());
            int c = a / b;
            System.out.println("Result :" + c);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Wrong Input, enter integer");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Wrong Input, enter integer");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero, result infinity");
        }


        scan.close();

    }
}

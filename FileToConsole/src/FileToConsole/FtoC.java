package FileToConsole;
import java.io.File;
import java.util.Scanner;

public class FtoC {
    public static void main (String[] args) throws Exception
    {
        File p= new File("D:\\Users\\Lenovo\\Documents\\Java lab\\FileToConsole\\One.txt");
        Scanner s=new Scanner(p);
        String input=s.nextLine();
        while(!input.equals("exit"))
        {
            System.out.println(input);
            input=s.nextLine();
        }
        s.close();
    }
}

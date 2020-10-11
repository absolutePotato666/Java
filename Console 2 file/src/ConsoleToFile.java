import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleToFile {
    public static void main (String[] args) throws Exception
    {
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        PrintStream p = new PrintStream(new File("pikachu.txt"));
        while(!input.equals("exit"))
        {
            p.println(input);
            input=s.nextLine();
        }
        p.close();
        s.close();
    }


}

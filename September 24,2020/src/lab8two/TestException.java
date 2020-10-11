package lab8two;

import java.io.IOException;
import java.security.InvalidParameterException;

public class TestException {
    public static void main(String[] args)
    {
        throwException(105);
    }
    public static void throwException(int n) throws InvalidParameterException, IOException
    {
        Integer.parseInt("2");
        if(n<=0)
        {

        }
        if(n>100)
        {

        }
        System.out.println(n*n);
    }
}


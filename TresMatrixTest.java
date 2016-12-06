/**
 * TresMatrixTest.java - Runs test cases for the TresMatrix Class.
 * 
 * @author Justin Watts
 * @version 13-NOV-2014
 */
public class TresMatrixTest
{
    public String validate(int expected, int actual)
    {
        String result = "Fail";
        if (expected == actual) 
           result = "Pass";
        return result;
    }
    
    public String validate(boolean expected, boolean actual)
    {
        String result = "Fail";
        if (expected == actual) 
           result = "Pass";
        return result; 
    }

    public String validate(int[] expected, int[] actual)
    {
        String  result = "Fail";
        boolean pass = true;

        if (expected.length != actual.length)
           pass = false; 

        int i = 0; 
        while (pass && i < actual.length)
        {
            if (expected[i] != actual[i])
               pass = false; 
            ++i; 
        }

        if (pass)
           result = "Pass"; 

        return result; 
    }
    
    public String validate(Treasure[][] expected, Treasure[][] actual)
    {
        String  result = "Fail";
        boolean pass = true;

        if (expected.length != actual.length)
            pass = false; 

        int i = 0, j = 0;
        while (pass && i < actual.length)
        {
            while (pass && j < actual[i].length)
            {
                if (!expected[i][j].equals(actual[i][j]))
                    pass = false; 
                ++j;
            }
            ++i;
        }

        if (pass)
           result = "Pass"; 

        return result; 
    }
}
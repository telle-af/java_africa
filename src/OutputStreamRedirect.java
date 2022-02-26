import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class OutputStreamRedirect {

    public static void main(String[] args) {
        try
        {
            // Save original out stream.
            PrintStream originalOut = System.out;
            // Save original err stream.
            PrintStream originalErr = System.err;
            // Create a new file output stream.
           // PrintStream fileOut = new PrintStream("./out.txt");
            // Create a new file error stream.
            PrintStream fileErr = new PrintStream("./report.txt");
            // Redirect standard out to file.
           // System.setOut(fileOut);
            // Redirect standard err to file.
            System.setErr(fileErr);
            // Wrapped Scanner to get user input.
            Scanner scanner = new Scanner(System.in);
            // Print data in command console.
            DatabaseConnect.connect();
            DatabaseConnect.retrieveSentSMS();

        }catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    /* Check whether the string is an email address or not. */
    private static boolean isValidEmail(String email)
    {
        boolean ret = true;
        if(email==null || email.trim().length()==0)
        {
            ret = false;
        }else
        {
            int index = email.indexOf("@");
            if(index == -1)
            {
                ret = false;
            }
        }
        return ret;
    }


}

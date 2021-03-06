// I was not sure so I made the currency converter function also
// importing all classes from java.io package
import java.io.*;

public class Converter
{
    // define buffered reader std input stream
    // we pass an input stream Reader object in buffered reader
    // and also pass the std input object in input stream reader
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    // the input stream is created

    // tempConverter function takes a double argument fahrenheit temperature and returns celsius temperature appended into the output string
    public static String tempConverter(double fahrenheit)
    {
        double celsius = (5.0/9.0) * (fahrenheit - 32);
        String output = String.valueOf(fahrenheit)+" deg F is equal to "+String.valueOf(celsius)+" deg C";
        // String.valueOf() returns the string representation of the object passed
        return output;
    }

    // currencyConverter function takes a double argument usDollar and returns the converted euro appended into the output string
    public static String currencyConverter(double uSDollar)
    {
        double euroPerDollar = 0.83;
        double euro = euroPerDollar * uSDollar;
        String output = "$"+String.valueOf(uSDollar)+" is equal to "+String.valueOf(euro)+" Euros"; 
        // String.valueOf() returns the string representation of the object passed
        return output;    
    }

    //printing function prints the output in specific way
    public static void printing(String output)
    {
        // our formatted output
        System.out.println("===========================================================");
        System.out.println(output);
        System.out.println("===========================================================");
        System.out.println("");
    }

    // the main function
    public static void main(String []args) throws IOException // as buffered reader object may throw IOException
    {
        double fahrenheit, uSDollar;
        System.out.print("Enter temperature in deg F > ");
        fahrenheit = Double.parseDouble(in.readLine());
        printing(tempConverter(fahrenheit)); // calling our printing function and passing in the return value from our tempConverter function
        
        // remove the "//" from the three lines below to use the currencyConverter function       
        //System.out.print("Enter number of USD to convert > ");
        //uSDollar = Double.parseDouble(in.readLine());
        //printing(currencyConverter(uSDollar)); // calling our printing function and passing in the return value from our currencyConverter function
    }
}

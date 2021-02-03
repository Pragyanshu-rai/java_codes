//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;
import java.io.InputStreamReader;
import java.io.BufferedReader;
//import java.util.ArrayList;
import java.io.IOException;
import java.util.Iterator;
import java.io.FileReader;
import java.util.HashMap;
public class CSVReader
{
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedReader fileIn;
    public static HashMap<String, Integer> head = new HashMap<String, Integer>();
    public static HashMap<Integer, String> rows = new HashMap<Integer, String>();
    public static Iterator headIt, rowsIt;
    /*public static String countryInfo(CSVParser parser, String country)
    {
        for(CSVRecord record : parser)
            if(record.contains(country))
                return head("Country") + " : " + head("Exports") + " : " + head("Value") + "\n";
    }
    public static String twoProductsExporter(CSVParser parser, String exportItem1, String exportItem2)
    {
        for(CSVRecord record : parser)
            if(record.contains(exportItem1) && record.contains(EportItem2))
                return head("Country") + "\n";
    }
    public static int numberOfExporters(CSVPareser parser, String exportItem)
    {
        int count = 0; 
        for(CSVRecord record : parser)
            if(record.contains(exportItem))
                count++;
        return count;
    }*/
    public static void csvParser(BufferedReader fileIn) throws IOException
    {
        String inputArray[],input,inputArrayCopy[];

        inputArray = fileIn.readLine().split(",");
        inputArrayCopy = inputArray;
        int index=0,size=0;
        for(String str : inputArray)
        {
            head.put(str,new Integer(index));
            index++;
        }
        index = 0;
        while((input = fileIn.readLine())!= null)
        {
            //inputArray = fileIn.readLine().split(",");
            rows.put(new Integer(size),input);
            size++;
        }
        while(index < 3)
        {
            System.out.print(head.get(inputArray[index])+" ");
            index++;
        }
        System.out.println();
        index=0;
        while(index < size)
        {
            int test=0;
            inputArray = rows.get(new Integer(index)).split("\"");
            inputArrayCopy = inputArray[3].split(",");
            for(String str : inputArrayCopy)
                test++;
            if(test > 4 )
            System.out.println(inputArray[0]+" "+inputArray[3/*head.get(inputArrayCopy[0])*/]+" ");
            index++;
        }
    }
    public static void main(String []args) throws IOException 
    {
        String fileName;
        System.out.println("Enter the File name");
        fileName = in.readLine();
        if(fileName.length() < 1)
            fileName = "exports_small.csv";
        fileName = "./" + fileName;
        fileIn = new BufferedReader(new FileReader(fileName));
        csvParser(fileIn);
        /*for(CSVRecord record : parser)
            System.out.print(countryInfo(parser,head("Country")));
        for(CSVRecord record : parser)
            System.out.print(twoProductsExporter(parser, "gold", "diamonds"));
        for(CSVRecord record : parser)
            System.out.print(numberOfExporters(parser, "gold"));
                
    */}
}

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;
public class CSVReader
{
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedReader fileIn;
    public static CSVParser parser;
    public static String countryInfo(CSVParser parser, String country)
    {
        for(CSVRecord record : parser)
            if(record.contains(country))
                return record.get("Country") + " : " + record.get("Exports") + " : " + record.get("Value") + "\n";
    }
    public static String twoProductsExporter(CSVParser parser, String exportItem1, String exportItem2)
    {
        for(CSVRecord record : parser)
            if(record.contains(exportItem1) && record.contains(EportItem2))
                return record.get("Country") + "\n";
    }
    public static int numberOfExporters(CSVPareser parser, String exportItem)
    {
        int count = 0; 
        for(CSVRecord record : parser)
            if(record.contains(exportItem))
                count++;
        return count;
    }
    public static void main(String []args)
    {
        String fileName;
        System.out.println("Enter the File name");
        fileName = in.readLine();
        if(fileName.length() < 1)
            fileName = "exports_small.csv";
        fileName = "./" + fileName;
        fileIn = new BufferedReader(new FileReader(fileName));
        parser = fileIn.getCSVParser();
        for(CSVRecord record : parser)
            System.out.print(countryInfo(parser,record.get("Country")));
        parser = fileIn.getCSVParser();
        for(CSVRecord record : parser)
            System.out.print(twoProductsExporter(parser, "gold", "diamonds"));
        parser = fileIn.getCSVParser();
        for(CSVRecord record : parser)
            System.out.print(numberOfExporters(parser, "gold"));
                
    }
}

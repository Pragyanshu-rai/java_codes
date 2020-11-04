import java.io.*;
public class rp
{
    public static void main(String args[]) throws IOException
    {
        PrintWriter out;
        FileWriter fo;
        File f = new File("./tef.txt");
        if(!f.exists())
            f.createNewFile();
        out = new PrintWriter(new FileWriter(f,true),true);
        out.print("test ");
        out.close();
    }
}

import java.io.*;
public class Fileh4
{
	public static void main(String []args) throws IOException
	{
		FileWriter fw = new FileWriter("./note2.txt",true);//true is for append
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("\nPragyanshu Rai");
		bw.close();
	}
}

import java.io.*;
public class BufferedStream
{
	private static int x=69;
	public static void main(String []args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader("info2.txt"),1024);//BufferedReader(FileReader object,int buffersize(in bytes)); default and recommended size is 8192 bytes
		PrintStream pout = new PrintStream("info4.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter("info4.txt",true));
		//String line = new String();
		char[] buff=new char[1024];
		int val=0;
		while((val=reader.read(buff))!=-1)
		{			
			writer.write(buff,0,val);
			writer.flush();
		}
		//pout.println("The Value of X is : "+x);
		pout.close();
		reader.close();
		writer.close();
	}
}

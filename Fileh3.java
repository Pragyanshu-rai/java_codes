import java.io.*;
public class Fileh3
{
	public static void main(String []arg) throws IOException
	{
		int i;
		FileInputStream fi= new FileInputStream("./note3.txt");
		do
		{
			i=fi.read();
			if(i!=-1)
				System.out.print((char)i);	
		}while(i!=-1);
		fi.close();
	}
}

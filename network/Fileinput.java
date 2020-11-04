import java.io.*;
public class Fileinput
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("info.txt");
		int fr;
		while((fr=file.read())!=-1)		
			System.out.print((char)fr);
		file.close();
	}
}

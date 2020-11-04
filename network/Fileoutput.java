import java.io.*;
public class Fileoutput
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream file = new FileOutputStream("info.txt",true);
		String s = "SHipra Rai\n";
		for(int i=0;i<s.length();i++)		
			file.write(s.charAt(i));
		System.out.println("Saving data...........\ndone");
		file.close();
	}
}

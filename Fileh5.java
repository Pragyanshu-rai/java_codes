import java.io.*;
public class Fileh5
{
	public static void main(String []arg) throws IOException
	{
		int f;
		BufferedReader br =  new BufferedReader(new FileReader("note2.txt"));
		//while((f = br.read())!=-1)
		//	System.out.print((char)f);
		char c[] = new char [10];
		br.read(c,4,3);
		System.out.println(c);
		String s1 = new String();
		while((s1=br.readLine())!=null)
			System.out.print(s1);
		br.close();
	}
}

import java.io.*;
public class Fileh5
{
    public static String line="";
	public static void main(String []arg) throws IOException
	{
		int f;
		BufferedReader br =  new BufferedReader(new FileReader("Axl2p.fa"));
		//while((f = br.read())!=-1)
		//	System.out.print((char)f);
		char c[] = new char [10];
		//br.read(c,4,3);
		//System.out.println(c);
		String s1 = new String();
		while((s1=br.readLine())!=null)
            line+=s1;			
        System.out.print(line);
		br.close();
	}
}

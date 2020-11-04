import java.io.*;
public class Fileh2
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fo = new FileOutputStream("./note3.txt",true);//true is for append
		String s = "PRAGYANSHU RAI";
		char ch[] = s.toCharArray();
		for(int i=0;i<s.length();i++)
			fo.write(ch[i]);
		fo.close();
	}
}

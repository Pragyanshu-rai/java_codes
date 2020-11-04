import java.io.*;
public class CharStream
{
	public static void main(String []args) throws IOException
	{
		File file = new File("info2.txt");
		boolean b = file.exists()?true:file.createNewFile();
		InputStreamReader in = new InputStreamReader(new FileInputStream("info2.txt"));
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("info2.txt",true)),out2 = new OutputStreamWriter(new FileOutputStream("info2.txt",true),"ASCII");//can set as ascii also by default the same encoding is used as the system uses 
		out2.write("Hello broooooooo\n");
		out2.flush();
		out.write("もっと\n😀️\n");
		out.close();//close method calls flush()
		out2.close();
		int x;
		while((x=in.read())!=-1)
			System.out.print((char)x);
		in.close();
	}
}

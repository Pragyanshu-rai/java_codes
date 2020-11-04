import java.io.*;
public class DataStream
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("test1.mp4");
		if(!file.exists())
			file.createNewFile();
		System.out.println("FIle Name : "+file.getName()+"\nFile Path : "+file.getAbsolutePath());
		DataOutputStream out = new DataOutputStream(new FileOutputStream("pranshumeralaal.mp4",true));
		DataInputStream in = new DataInputStream(new FileInputStream(file.getName()));
		byte[] buff = new byte[1024];
		while(in.read(buff,0,1024)!=-1)
		{
			out.write(buff,0,1024);
			out.flush();
		}
		out.flush();
		//out.writeDouble(123.456);
		//out.writeFloat(124.11f);
		//out.writeInt(69);
		//System.out.println("Integer = "+in.readInt()+"\nDouble = "+in.readDouble()+"\nFloat = "+in.readFloat());
		out.close();
		in.close();
	}
}

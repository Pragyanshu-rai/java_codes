import java.io.File;
import java.io.IOException;
public class Fileh
{
	public static void main(String []args) throws IOException
	{
		File f1 = new File("/home/pragyanshu/Desktop/java/note1.txt");
		boolean b =f1.exists()?true:f1.createNewFile();
		System.out.println("Does The File Exist _> "+f1.exists());
		System.out.println("File Size _> "+f1.length());
		System.out.println("File name _> "+f1.getName());
		//f1.delete();
	}
}

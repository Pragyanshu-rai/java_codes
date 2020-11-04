import java.net.*;
import java.io.*;
public class Url1
{
	public static void main(String []arr) throws IOException
	{
		URL url = new URL("https://myanimelist.net/anime/30276/One_Punch_Man");
		URLConnection myurl = url.openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(myurl.getInputStream()));
		String line = new String();
		while((line=reader.readLine())!=null)
			System.out.println(line);
		reader.close();
	}
}

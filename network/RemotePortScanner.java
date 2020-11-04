import java.io.*;
import java.net.*;
public class RemotePortScanner
{
	private static int Port = 0 ;
	private static boolean isValid = false;
	public static void main(String []args)
	{
		try{
		PrintWriter out1 = new PrintWriter("info69.txt");
		String ip= new String();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter The Target IP Address\n:> ");
		ip = in.readLine();
		while(!isValid)
		{
			try
			{
				Socket scan = new Socket(ip,Port);
				out1.println(ip+" Listening port -> "+Port);
				out1.flush();
				System.out.println(ip+" Listening port -> "+Port);
					
				scan.close();
			}
			catch(IOException e)
			{
				System.out.println(ip+" Not Open port -> "+Port);
			}
			if(Port==65535)
				isValid=true;
			Port++;
		}
		}
		catch(IOException ioe)
		{
			System.out.print("Enter The Target IP Address2\n:> ");			
		}	
	}
}

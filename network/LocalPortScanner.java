import java.io.*;
import java.net.*;
public class LocalPortScanner
{
	private static int Port = 0;
	public static void main(String []args)
	{
		while(Port < 65536)//65535 is the total number of network ports in a system a unsigned 16 bit int 
		{
			try
			{
				ServerSocket server = new ServerSocket(Port);
			}
			catch(IOException e)
			{
				System.out.println("[LOCAL-SCAN] This Port is open -> "+Port);
			}
			Port++;
		}
	}
}

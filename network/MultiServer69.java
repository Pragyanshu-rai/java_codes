import java.io.*;
import java.net.*;
public class MultiServer69
{
	private static int clnum = 1 , i = 0;
	private static boolean stop = false;
	public static void main(String []args)throws Exception
	{	
		ServerSocket server = new ServerSocket(9069);
		while(!stop)
		{
			System.out.println("[SERVER]Waiting for clients.......................");
			Socket client = server.accept();
			System.out.println("[SERVER]Connected to a "+clnum+" Client(s)");
			MultiClient mc = new MultiClient(client);
			mc.start();
			if(i==6)
				stop=true;
			clnum++;
			i++;
		}
		server.close();
	}
}
class MultiClient extends Thread
{
	private Socket client;
	public MultiClient(Socket soc)
	{
		client = soc;
	}
	public void run()
	{
		try
		{		
			PrintWriter out = new PrintWriter(client.getOutputStream(),true);
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out.println("[SERVER] Hello Client 😀️ "+client.getRemoteSocketAddress());
			String msg = reader.readLine();
			System.out.println("[SERVER] client msg = "+msg);
			out.println("[SERVER] Your msg = "+msg);
			out.close();
			reader.close();		
			client.close();
		}
		catch(Exception e)
		{

		}
	}
}

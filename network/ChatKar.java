import java.io.*;
import java.net.*;
public class ChatKar 
{
	private static int port = 9069;
	private static ServerSocket server; 
	private static String question,ip="192.168.1.14",msg,lmsg=null;
	private static BufferedReader reader,in;
	private static PrintWriter out;
	private static boolean stop = false,work = true;
	public static void main(String arg[]) throws IOException
	{
			reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Are you The Server Or Client (client recommended) \n:> ");
			while(work)
			{
				question=reader.readLine();
				if(question.equalsIgnoreCase("Server"))
					work=chatKarServer();
				else if(question.equalsIgnoreCase("Client"))
					work=chatKarClient();
				else
					System.out.print("Please Enter A Valid Choice\n:>");
			}
	}
	public static boolean chatKarServer()throws IOException
	{
		Socket csocket = null;
		System.out.println("[SERVER] Waiting For Client ........");
		try
		{
			server = new ServerSocket(port);
			csocket = server.accept();
			System.out.println("[SERVER] Connection Established!!!!");
			out = new PrintWriter(csocket.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(csocket.getInputStream()));
			out.println("[SERVER] Hey Client (to exit \":quit\")");
		}
		catch(Exception e)
		{	
			System.out.println("[SERVER] A Problem Occured While Opening A Connection : "+e.getMessage());
			reader.close();
			out.close();
			server.close();
			csocket.close();
			return false;
		}
		while(!stop)
		{
			msg=in.readLine();
			if(question.equals(":quit")||msg.equals(":quit"))
			{
				stop=true;
				out.println(msg);
			}
			else
			{
				System.out.println(msg+"  (your turn)");
				question=reader.readLine();				
				out.println(question);
			}
		}
		reader.close();
		out.close();
		server.close();
		csocket.close();
		return false;
	}
	public static boolean chatKarClient()throws IOException
	{		
		Socket client = null;
		try
		{
			client = new Socket(ip,port);
			System.out.println("[CLIENT] Connection Established!!!");
			
			out = new PrintWriter(client.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));	
			System.out.println(in.readLine());
		}
		catch(Exception e)
		{	
			System.out.println("[CLIENT] A Problem Occured While Opening A Connection : "+e.getMessage());
			reader.close();
			out.close();
			client.close();
			return false;
		}
		while(!stop)
		{
			question=reader.readLine();				
			out.println(question);
			msg=in.readLine();
			System.out.println(msg+"  (your turn)");
			if(question.equals(":quit")||msg.equals(":quit"))
			{
				stop=true;
				out.println(msg);
			}
		}
		reader.close();
		out.close();
		client.close();
		return false;
	}
}

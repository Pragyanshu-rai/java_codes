import java.io.*;
import java.net.*;
class ChatKar 
{
	private int port = 9069;
	private ServerSocket server;
	private Socket csocket,client;
	private String question,ip="192.168.1.14",msg,lmsg=null;
	private BufferedReader reader,in;
	private PrintWriter out;
	private boolean stop = false,work = true;
	public static void main(String arg[]) throws IOException
	{
			reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Are you The Server Or Client (client recommended) \n:> ");
			while(work)
			{
				question=reader.readLine();
				if(question.equalsIgnoreCase("Server"))
					work=chatKarServer();
				else if(question.equalsIgnoreCase("Client"))
					work=chatKarClient();
				else
					System.out.println("Please Enter A Valid Choice\n:>");
			}
	}
	public boolean chatKarServer()
	{
		try
		{
			server = new ServerSocket(port);
			csocket = server.accept();
			out = new PrintWriter(csocket.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(csocket.getInputStream()));
			out.println("[SERVER] Hey Client");
		}
		catch(Exception e)
		{	
			System.out.println("[SERVER]A Problem Occured While Opening A Connection : "+e.getMessage());
		}
		while(!stop)
		{
			question=reader.readLine();				
			out.println(question);
			msg=in.readLine();
			if(!msg.equals(lmsg))
				System.out.println(msg);
			lmsg=msg;
			if(lmsg.equals(":quit"))
				stop=true;
		}
		reader.close();
		out.close();
		server.close();
		csocket.close();
		return false;
	}
	public boolean chatKarClient()
	{		
		try
		{
			client = new Socket(ip,port);
			out = new PrintWriter(client.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		}
		catch(Exception e)
		{	
			System.out.println("[CLIENT]A Problem Occured While Opening A Connection : "+e.getMessage());
		}
		while(!stop)
		{
			question=reader.readLine();				
			out.println(question);
			msg=in.readLine();
			if(!msg.equals(lmsg))
				System.out.println(msg);
			lmsg=msg;
			if(lmsg.equals(":quit"))
				stop=true;
		}
		reader.close();
		out.close();
		client.close();
		return false;
	}
}

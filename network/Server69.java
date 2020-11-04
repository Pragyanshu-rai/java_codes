import java.io.*;
import java.net.*;
public class Server69
{
	private static boolean stop = false;
	public static void main(String []args) throws Exception
	{
		ServerSocket server = new ServerSocket(9069);//create a server socket
		System.out.println("[SERVER]Waiting for clients.......................");	
		Socket soc = null;	
		PrintWriter out=null;
		BufferedReader reader=null;
		DataInputStream dis=null;
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("pp.png"));
		while(!stop)
		{	
			soc = server.accept();//socket to communucate with the client
			out = new PrintWriter(soc.getOutputStream(),true);
			//reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			dis = new DataInputStream(soc.getInputStream());
			System.out.println("[SERVER]Connected to a Client");
			out.println("[SERVER] Hello Client");
			byte[] buff = new byte[1024];
			while(dis.read(buff,0,1024)!=-1)
			{
				dos.write(buff,0,1024);
				dos.flush();
			}
			//if(msg.equals(":q/192.168.1.14:9069"))
			stop=true;
			System.out.println("File Download Complete!!!!!!");
			//out.println("[SERVER] Your msg = "+msg);
		} 
		out.close();
	//	reader.close();
		dis.close();
		soc.close();
		server.close();
	}
}

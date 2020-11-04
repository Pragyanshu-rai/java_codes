import java.io.*;
import java.net.*;
public class Client69
{
	public static void main(String []args)throws Exception
	{
		ShowInet.show();
		Socket sc = new Socket("192.168.1.10",9069);
		String ipp =sc.getRemoteSocketAddress().toString();//to get ip of client
		//PrintWriter out = new PrintWriter(sc.getOutputStream(),true);//true for auto flush
		BufferedReader in1 = new BufferedReader(new InputStreamReader(sc.getInputStream())),in2 = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream out1 = new DataOutputStream(sc.getOutputStream());
		System.out.println("[CLIENT] "+in1.readLine());
		System.out.print("[CLIENT] Please Enter The File Name \n:>");
		String s1 = in2.readLine();
		File file = new File(s1);
		if(!file.exists())
			System.exit(0);
		DataInputStream in3 = new DataInputStream(new FileInputStream(file.getName()));
		byte[] buff=new byte[8192];
		while(in3.read(buff,0,8192)!=-1)
		{
			out1.write(buff,0,8192);
			out1.flush();
		}
		//System.out.println("[CLIENT] "+in1.readLine());
		out1.close();
		in1.close();
		in2.close();
		in3.close();
		sc.close();
	}
}
class ShowInet
{
	public static void show()
	{
		try{
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address.getHostAddress());
			System.out.println(address.getHostName());
			InetAddress address2 = InetAddress.getByName("google.com");
			System.out.println(address2.getHostAddress());
			System.out.println(address2.getHostName());
		}
		catch(UnknownHostException uhe)
		{

		}		
	}
}

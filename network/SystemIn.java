import java.io.*;
public class SystemIn
{
	private static int port = 0;
	private static boolean isValid = false; 
	public static void main(String[] args)
	{
		String ip = new String();
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inp);
		System.out.print("Enter A Port Number \n:> ");
		while(!isValid)		
		{
			try
			{
				ip = br.readLine();
				port=Integer.parseInt(ip);
				isValid=true;
			}
			catch(NumberFormatException nfe)
			{
				System.out.print("Please Enter A Valid Port Number!!!!!\n:> ");
			}
			catch(Exception e)
			{
				System.out.print("Could not read the port Number Enter Again\n:> ");
			}
		}
		System.out.print("Enter The Target(server) Ip Address\n:> ");
		try
		{
			ip = br.readLine();
		}
		catch(Exception e)
		{
			System.out.println("cannot read IP Address " +e.getMessage());
		}
		System.out.println("[CLIENT] Connecting................done\n[CLIENT] Connected to ip "+ip+" via port "+port);
	}
}

class Servert extends Thread
{
	private int clientnumber=1;
	public Servert(String tn)
	{
		this.setName(tn);
	}
	public void run()
	{
		while(clientnumber!=100)
		{
			System.out.println(this.getName()+" sent data to client "+clientnumber);
			clientnumber++;
		}
	}
}
public class Threads1
{
	public static void main(String[] arg)
	{
		Servert s1= new Servert("Server 1");
		Servert s2= new Servert("Server 2");
		s1.start();
		s2.start();
	}
}

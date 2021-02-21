class ClockWorK extends Thread
{
	private int hour=06,min=43,sec=10;
	public ClockWorK(int x)
	{
		sec=x;
	}
	public void run()
	{
		try
		{
			while(sec!=60)
			{
				System.out.println(hour+" : "+min+" : "+sec);
				this.sleep(1000);
				sec++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}

public class MyClock
{
	public static void main(String[] args)
	{
		ClockWorK cl = new ClockWorK(0);
		cl.start();
	}
}

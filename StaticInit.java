public class StaticInit
{
	public static int y;
	static 
	{
		System.out.println("This is the init block y: "+y);
		y=20;	
	}
	public StaticInit()
	{
		System.out.println("This is the constructor block y: "+y);
	}
	public static void main(String []arg)
	{
		StaticInit s1=new StaticInit();
		StaticInit s2=new StaticInit();	
	}
}

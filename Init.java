public class Init
{
	public int x;
	{
		System.out.println("This is the initializer block x: "+x);
		x=5;
	}
	public Init()
	{
		System.out.println("This is the constructor block x: "+x);
	}
	public static void main(String []arg)
	{
		Init i1=new Init();
		Init i2=new Init();
	}
}

class Box
{
	private int len,bre,hei;
	public void set(int l,int b,int h)
	{
		len=l; bre=b; hei=h;
	}
	public void show()
	{
		System.out.println("lenght = "+len);
		System.out.println("breadth = "+bre);
		System.out.println("height = "+hei);
	}
}
class Eg
{
	public static void main(String arg[])
	{
		Box b=new Box();//"()" represents the default constructor of the class 
		b.set(30,20,20);
		b.show();
		b=new Box();
		b.show();	
	}
}


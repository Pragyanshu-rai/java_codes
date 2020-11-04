public class GenericMethods
{
	public <a,b> void printarray(a []s,b ch)
	{
		for(a x : s)
			System.out.println(x);
		System.out.println(ch);
	}
	public static void main(String []ar)
	{
		GenericMethods gm = new GenericMethods();
		String[] bikes = new String[]{"Kawasaki","Yamaha","BMW","Honda"};
		Integer[] price = {15,24,26,22,40,47,85};
		gm.printarray(bikes,"Bitch");
		gm.printarray(price,"h2r");	
	}
}

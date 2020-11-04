class Demo<x>
{
	x i;
	public void add(x k)
	{
		i=k;
	}
	public x get()
	{
		return i;
	} 
}
public class GenericClass
{
	public static void main(String []args)
	{
		Demo<Integer> d1 = new Demo<Integer>();
		Demo<String> d2 = new Demo<String>();
		Integer i = new Integer(49);
		d1.add(i);
		d2.add("Pragyanshu");
		System.out.println("m1 = "+d2.get()+"\nm2 = "+d1.get());
	}
}

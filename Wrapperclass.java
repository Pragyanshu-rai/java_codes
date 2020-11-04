class WrapperClass
{
	public static void main(String[] arg)
	{
		Integer i1 = Integer.valueOf("1212");//returns the object of the type calling and is a static member
		Integer i2 = Integer.valueOf("1010",2);//can pass a second argument as the base
		int a = Integer.parseInt("1313");//returns the value of the type calling and is a static member
		System.out.println("a = "+a);
		int b =	i1.intValue();//returns the value of the object calling in the type mentioned before Value
		System.out.println("i1 or b = "+b);	 
	}
}

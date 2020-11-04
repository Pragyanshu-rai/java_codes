class Cli2
{
	public static void main(String []ar)
	{
		int s=0,x;
		System.out.print("The given number of inputs is "+ar.length+"\n");
		for(int i=0;i<ar.length;i++)
		{
			x=Integer.parseInt(ar[i]);
			s+=x;
		}
		System.out.println("The sum is "+s);
	}
}

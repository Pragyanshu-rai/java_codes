public class ForLoop
{
	public static void main(String []ar)
	{
		int i=0;
		String s = "honey";
		char c[] = s.toCharArray();
		for(char x : c)
		{	
			c[i]=x;
			System.out.println(x);
			i++;
		}
		for(i=0;i<s.length();i++)
				System.out.print(c[i]);
	}
}

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.io.*;
public final class HashSetandLinkedHS
{
	private static HashSet<String> hs = new HashSet<String>();
	private static LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
	private static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] arhs)throws IOException
	{
		hs.add("hoi brio");
		for(int i=0;i<17;i++)
		{
			lhs.add(new Integer(i));
			if(i<10) hs.add(Integer.toString(i));
		}
		hs.add("hoi");
		out.write("HashSet - "+hs+"\nsize - "+hs.size()+"\nLinkedHashSet - "+lhs+"\nsize - "+lhs.size()+"\n");
		out.flush();
	}
} 

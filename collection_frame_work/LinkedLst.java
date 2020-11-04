import java.io.*;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;
public class LinkedLst
{
	private static Integer[] arr;
	private static PrintWriter out = new PrintWriter(System.out,true);
	private static LinkedList<Integer> ll = new LinkedList<Integer>();
	private static Iterator<Integer> it = ll.iterator();
	public static void main(String []args) throws IOException
	{
		try
		{	
			run();
			throw new Exception("ConcurrentModificationException");	
		}
		catch(Exception e)
		{
			out.println("Exception occured : "+e.getMessage());
			//e.printStackTrace();
		}		
		arr = ll.toArray(new Integer[ll.size()]);
		for(Integer j:arr)
			out.println("arr - "+j);
	}
	public static synchronized void run()
	{
		for(int i=0;i<20;i++)
			ll.add(new Integer(i));
		for(Integer i : ll)
			out.println(" - "+i+" Size "+ll.size());
		ll.add(10,new Integer(19+49+1));
		ll.remove(16);
		out.println("Another For loop");
		for(int i=0;i<ll.size();i++)
			out.println(" - "+ll.get(i)+" Size "+ll.size());
			while(it.hasNext())
				out.println(" - "+it.next()+" Size "+ll.size());
		arr = ll.toArray(new Integer[ll.size()]);
		for(Integer j:arr)
			out.println("arr - "+j);
	}
}

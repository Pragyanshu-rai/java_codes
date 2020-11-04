import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.Stack;
import java.io.*;
public class VectorandStack
{
	private static Enumeration e1,e; 
	private static Vector<Integer> v = new Vector<Integer>();
	private static Stack<Integer> s = new Stack<Integer>();
	//private static Iterator<Integer> it=v.iterator(),it2=s.iterator();
	private static PrintWriter out = new PrintWriter(System.out,true);
	public static void main(String[] args)throws Exception
	{
		out.println("The Vector v is Empty(Before) - "+v.isEmpty());
		out.println("The Stack s is Empty(Before) - "+s.isEmpty());
		out.println("Vector capacity is - "+v.capacity());		
		for(int i=0;i<15;i++)
		{
			s.push(new Integer(i));
			if(i<12)
				v.add(new Integer(i));
		}
		out.println("The Vector v is Empty(After) - "+v.isEmpty());
		out.println("The Stack s is Empty(After) - "+s.isEmpty());
		out.println("Vector capacity is - "+v.capacity());
		out.println("Vector enum");
		e = v.elements();
		while(e.hasMoreElements())
			out.println("- "+e.nextElement());
		out.println("Stack enum");
		e1 = s.elements();
		while(e1.hasMoreElements())
			out.println("- "+e1.nextElement());
		out.println("Vector it");
		for(Integer i : v)
			out.println("- "+i+" vector size "+v.size());
		out.println("Stack total");
		out.println("- "+s+" stack size "+s.size());
	}
}

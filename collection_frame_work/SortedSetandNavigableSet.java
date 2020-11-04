import java.util.TreeSet;
//import java.util.SortedSet;
//import java.util.NavigableSet;
import java.io.*;
/*
* As SortedSet And NavigableSet are interfaces we use TreeSet inorder to use its functionality.
*/
public class SortedSetandNavigableSet
{
	private static TreeSet<Integer> ns = new TreeSet<Integer>();
	private static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String []args) throws IOException
	{
		for(int i=24;i<35;i++)
			ns.add(new Integer(i));
		for(int i=0;i<15;i++)
			ns.add(new Integer(i));
		out.write("ns - "+ns+"\n");
		out.write("ns[0-6] "+ns.headSet(new Integer(7))+"\n");
		out.write("ns[7-all] "+ns.tailSet(new Integer(7))+"\n");
		out.write("ns first "+ns.first()+"\n");
		out.write("ns last "+ns.last()+"\n");
		out.write("ns poll() "+ns.remove(new Integer(6))+"\n");
		out.write("ns ceiling(6) "+ns.ceiling(new Integer(6))+"\n");
		out.write("ns floor(6) "+ns.floor(new Integer(6))+"\n");
		out.write("ns higher(6) "+ns.higher(new Integer(6))+"\n");
		out.write("ns lower(6) "+ns.lower(new Integer(6))+"\n");
		out.flush();
	}
}

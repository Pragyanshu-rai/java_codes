import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.io.*;
public final class QueueandMap
{
	private static PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	private static HashMap<Integer,String> hm = new HashMap<Integer,String>();
	private static LinkedHashMap<Integer,String> lhm;
	private static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String []args) throws IOException
	{
		for(int i=0;i<10;i++)
		{
			pq.add(new Integer(i));
			hm.put(new Integer(i),in.readLine());
		}
		out.write("hm - "+hm+"\tSize - "+hm.size()+"\n");
		out.flush();
		hm.remove(0);
		for(int i=0;i<10;i++)
		{
			out.write("hm - "+hm.get(new Integer(i))+"\n");
			out.flush();
		}
		lhm = new LinkedHashMap<Integer,String>(hm);
		out.write("lhm - "+lhm+"\tIs Empty ? "+lhm.isEmpty()+"\n");
		out.flush();	
		for(int i=0;i<10;i++)
		{
			out.write("lhm - "+lhm.get(new Integer(i))+"\n");
			out.flush();
		}
		out.write("pq - "+pq+"\n");
		out.flush();
		Iterator it = pq.iterator();
		while(it.hasNext())
		{
			out.write("pq - "+it.next()+"\n");
			out.flush();	
		}
	}
}

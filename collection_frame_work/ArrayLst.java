import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayLst
{
	private static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter out1 = new PrintWriter(System.out,true);
	private static ArrayList l1 = new ArrayList(5),l2 = new ArrayList();
	private static String name = new String();	
	public static void main(String []args) throws IOException
	{
		out1.print("Enter a name\n-> ");
		out1.flush();
		name = in.readLine();
		l1.add(name);
		l1.add(new Integer(20));
		l1.add("Pragyanshu Rai");
		l1.add("Shipra Rai");
		l1.add(0,"Kamlesh Kumar Rai");
		l1.add("Blah Blah");
		l1.set(5,"Vineeta Rai");
		//new java.util.Vector().capacity();
		for(int i=0;i<l1.size();i++)
			out1.println((i+1)+" - "+l1.get(i));		
		name = System.console().readLine("Enter a name to remove\n-> ");
		l1.remove(name);
		out.write("The List L2 is Empty(Before) - "+l2.isEmpty()+"\n");
		out.flush();
		out1.printf("The Size of the List l1 - %d\n",l1.size());
		out1.printf("The Size of the List l2(before) - %d\n",l2.size());	
		l2.add("Family");
		l2.add(l1);
		out1.printf("The Size of the List l2(mid) - %d\n",l2.size());
		l2.remove("Pragyanshu Rai");
		l1.add(name);
		l2.add("Blah Blah");
		l2.add("Blah Blah");
		l2.add("Shipra Rai");
		l2.add("Blah Blah");
		l2.add("Shipra Rai");
		out1.printf("The Size of the List l2 - %d\n",l2.size());
		out1.println("\"Shipra Rai\" occurs first time at index - "+l2.indexOf("Shipra Rai")+" and occurs again at index - "+l2.lastIndexOf("Shipra Rai"));
		out.write("The List L2 is Empty - "+l2.isEmpty()+"\n"+"Is \"Pragyanshu Rai\" in the List l2 - "+l2.contains("Pragyanshu Rai")+"\n"+"Is \"Pragyanshu Rai\" in the List l1 - "+l1.contains("Pragyanshu Rai")+"\n");
		out.flush();
		Iterator it = l2.iterator();
		while(it.hasNext())
			out1.println(">> "+it.next());
		List l3 = l2.subList(1,4);
		Iterator it2 = l3.iterator();
		System.out.println("List l3");
		while(it2.hasNext())
			out1.println(">> "+it2.next());
	}
}

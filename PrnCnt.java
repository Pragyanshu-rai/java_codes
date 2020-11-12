import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class PrnCnt
{
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Integer> prime_list = new ArrayList<Integer>();
    public static Iterator it;
    public static boolean isPrime(int num)
    {
        int x=2;
        if(num<=1)
            return false;
        else if(num<=3)
            return true;
        while(x<=(num/2))
        {
            if(num%x==0)
                return false;
            x++;
        }
        return true;
    }
    public static int MyPrimeRange(int ll,int ul) throws Exception
    {
        int count=0,sum=0;
        for(int i=ll;i<=ul;i++)
        {
            if(isPrime(i))
                prime_list.add(new Integer(i));     
        }
        it = prime_list.iterator();
        while(sum<ul)
        {
            if(it.hasNext())
            sum+=(int)it.next();
            if(sum == 2)
                continue;
            else if(isPrime(sum))
                count++;
        }
        return count;
    }
    public static void main(String[] args) throws Exception
    {
        int ll,ul;
        out.write("Enter The Lower And Upper Limit!!!\n->");
        out.flush();
        ll=Integer.parseInt(in.readLine());
        ul=Integer.parseInt(in.readLine());
        System.out.println(MyPrimeRange(ll,ul));
    }
}

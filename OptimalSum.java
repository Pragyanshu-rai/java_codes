import java.io.BufferedReader;
import java.io.InputStreamReader;
public class OptimalSum
{
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String []arsg) throws Exception
    {
        int[] op1,op2,op_arr;
        int i,j,size,element=1,next_element=1,max=0;
        boolean optimal=false,change=false;
        System.out.println("Enter the size of the array");
        size=Integer.parseInt(in.readLine());
        op_arr=op2=op1 = new int[size];
        //op2 = new int[size];
        //op_arr = new int[size];
        System.out.println("Enter the elements in the array "+size);
        for(i=0;i<size;i++)
        {
            op_arr[i]=Integer.parseInt(in.readLine());
            op2[i]=1;
        }
        in.close();
        System.out.print("Computing.");
        for(i=0;i<size*2;i++)
            System.out.print(".");
        i=0;
        while(!optimal)
        {           
            if(change)
            {
                change=false;
                for(j=0;j<size;j++)
                    op2[j]=element;
                i=0;
            }
            for(;i<size;)
            {              
                op1[i]=op_arr[i]-op2[i];
                if(i==0)
                {
                    i++;
                    continue;
                }
                if(op2[i-1]>=op2[i]&&op1[i-1]<=op1[i])
                {
                    i++;
                    break;
                }
                op2[i]=next_element;
                next_element--;                
            }
            System.out.println("i = "+i+" op1[i] "+op1[0]+" op2[i] "+op2[0]);
            if(i==size)
            {
                if(op2[0]==op1[size-1])
                    optimal=true;
                else
                    change=true;
                element++;
                next_element=element;
            }
        }
        for(i=0,j=0;j<2;i++,j=i%4)
        {
            if(j==0&&op1[i]>max)
                max=op1[i];
            else if(j==1&&op1[i-4]>max)
                max=op2[i];        
        }
        System.out.println(max);
    }
}

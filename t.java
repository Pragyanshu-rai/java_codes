public class t
{
    public static void main(String []args)
    { 
        int i=0,j=0;
    aa: for(i=0;i<5;i++)
    {   
        ab: for(j=0;j<5;j++)
        {
            if(i-j==3)
                break aa;
        }
    }
    System.out.println("Out of the loop"+i+" "+j);
    }
}

package packtester;
import math.Sum;
public class Total
{
	public static void main(String []arg)
	{
		int a,b;
		Sum s1=new Sum();//always initialize the object or it won't be created 		
		a=s1.add(10,20);
		System.out.println("ADD = "+a);
		b=s1.sub(30,10);
		System.out.println("SUB = "+b);
	}
}
//must be compiled as "javac -d . FileName.java"
//must be run as "java packagename.FileName"

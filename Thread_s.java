public class Thread_s
{
	public static void main(String[] ar) throws Exception
	{
		B ob = new B();
		Runnable ob2 = new C();
		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(ob);
		Thread t3 = new Thread(ob2);
		D o3 = new D();
		t1.setPriority(10);
		t3.setPriority(1);//t3.MIN_PRIORITY);
		t2.start();
		t1.start();
		o3.start();
        t2.sleep(1000);
		t3.start();
        
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Thread B "+i);
	}
}
class C implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Thread C "+i);
	}
}
class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Thread A "+i);
	}
}
class D extends Thread implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Thread D "+i);
	}
}

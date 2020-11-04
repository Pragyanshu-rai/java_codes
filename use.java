public class use
{
	public static void main(String []arg)
	{
		Student s1=new Student();
		Person p1=new Person();
		s1.setAge(20);
		s1.setName("Pragyanshu Rai");
		s1.setRoll(49);
		p1.setAge(30);
		p1.setName("time pass");
		System.out.println("s1.age= "+s1.getAge());
		System.out.println("s1.name= "+s1.getName());
		System.out.println("s1.roll= "+s1.getRoll());
		System.out.println("p1.age= "+p1.getAge());
		System.out.println("p1.name= "+p1.getName());
	}
}

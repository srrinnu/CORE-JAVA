class ExistedProject
{
	public void task1()
	{
		int a=10,b=20;
		int res=a+b;
		System.out.println("u address res:"+res);
	}
	public void task2()
	{
		int a=10,b=20;
		int res=b-a;
		System.out.println("u r address"+res);
	}
}
class Project
{
	public void task3()
	{
		int a=10,b=20;
		int res=a*b;
		System.out.println("u r address"+res);
	}
	public void task1()
	{
		int a=10,b=20;
		int res=b/a;
		System.out.println("u r address"+res);
	}
}
public class InheritanceTech_2 {

	public static void main(String[] args) {
	Project p=new Project();
	p.task1();
	p.task1();
	p.task3();
	p.task1();
	
			
	}

}

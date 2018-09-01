class ProjectManager
{
	private int a =10;
	private static int b=20;
	private final int c=30;
	private final static int d=40;
	public void projectmanager(int a)
	{
		this.a=a;
	}
	public void concre_method()
	{
		System.out.println("this method are good write logics for instance variabe");
		System.out.println("a value is:\t"+a);
	
	}
	public static void Static_method()
	{
		System.out.println("this method is suitable for to write logic for staticvariable");
		System.out.println("b value is:\t"+b);
	}
	public void final_method()
	{
		System.out.println("this mehod is suitable for to write logic for final variable ");
		System.out.println("c value is:\t"+c);
		
	}
	public final static void mix_method()
	{
System.out.println("this method is suitable for to write logics for finalstatic method");
System.out.println(" value i:\t"+d);
	}
	
	
	
}
class developer extends ProjectManager
{
public developer(int a)
{
	super();
}
public void task(int x)
{
	System.out.println("x square root is:"+(x*x));
	System.out.println("project is sucess");
}
}

public class Client {

	public static  void main(String[] args) {
	ProjectManager p=new ProjectManager();
	p.concre_method();
	developer.Static_method();
	p.final_method();
	developer.mix_method();
	//p.task(5);
	}

}

class development
{
	private int a,b,c;
	public development(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void task()
	{
		int res= a+b;
		System.out.println("res is"+res);
	}
	public development(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void task2()
	{
		int res=a+b+c;
		System.out.println("ur res is:"+res);
	}
	public void task(int a,int b,int c,int d)
	{
		int res=a+b+c+d;
		System.out.println("res is"+res);
	}
}
public class Overloading {
public static void main(String[] args)
{
	development d=new development(10,20);
	d.task();
	
	development d1=new development(4,4,4);
	d1.task2();
	d.task(2,2,2,2);
			
}
}

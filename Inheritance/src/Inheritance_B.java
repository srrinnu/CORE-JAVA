class A
{
	private int a,b,c;
	private char x;
	public A()
	{
		a=10;b=20;
	}
	public A(int a,int b,int c)
	{
	this.a=a;
	this.b=b;
	this.c=c;
	}
	public A(char x,int b)
	{
		this.x=x;
		this.b=b;
	}
	public void task()
	{
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);
	
	}
	public void task1()
	{
		System.out.println("a value is:"+a);
		System.out.println(" b value is:"+b);
		System.out.println("c value is:"+c);
	}
	public void task2()
	{
		System.out.println("x value is:"+x);
		System.out.println("b value is:"+b);
	}
}//closing A
class B extends A{
	public B()
	{
		super();
	}
	public B(int a,int b,int c)
	{
		super(a,b,c);
	}

		public B(char x,int b)
		{
		super(x,b);
	}
	

private int x,y;
public B(int x,int y)
{
	this.x=x;
	this.y=y;
}
public void task3()
{
	System.out.println("x value is:"+x);
	System.out.println("y value is:"+y);
}
}
public class Inheritance_B {

	public static void main(String[] args) {
		
 B b=new B();
 b.task();
 B b2=new B(10,20,30);
 b2.task1();
 B b3=new B('y',100);
 b3.task2();
 B b4=new B(11,22);
 b4.task3();
		 
	}

}

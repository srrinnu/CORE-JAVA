class superclass
{
	public void task()
	{
		int a=10,b=20;
		int res=a+b;
		System.out.println("ur add res:"+res);
		
	}
	
}
class subclass extends superclass
{
	public void task()
	{
	int a=20,b=40;
	int res=b/a;
	System.out.println("u r res is:"+res);
	}
}
public class Override {

	public static void main(String[] args) {
	
superclass s=new subclass();
s.task();
subclass s2=(subclass)new superclass();
s2.task();
	}

}

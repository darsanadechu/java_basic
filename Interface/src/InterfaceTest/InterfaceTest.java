package InterfaceTest;

interface Square
{
	int a=5;//variable is public final static
	void print();//method is abstract public
	default void findSquare()
	{
		System.out.println(a*a);
	}
}
//interface implementing class
class A implements Square
{
	public void print()
	{
		System.out.println("finding square");
	}
}

public class InterfaceTest {

	public static void main(String[] arg)
	{
		A A1=new A();
		A1.print();
		A1.findSquare();
	}
}

package keywordSuper;

class A
{
	String name="Darsana";
	void print()
	{
		System.out.println("parent class");
	}
}
class B extends A
{
	B()
	{
		String name="Devika";
		//super invokes parent class function
		super.print();
		//super invokes parent class variable 
		System.out.println("name:"+super.name);

	}
	void print()
	{
		System.out.println("child class");
	}
}

public class testsuper {
	public static void main(String[] arg)
	{
		B B1= new B();
		B1.print();
		
	}

}

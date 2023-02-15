package AbstractClassTest;

//parent abstract class
abstract class Animal
{
	Animal()
	{
		System.out.println("Eating");
	}
	abstract void run();
	void catching()
	{
		System.out.println("catching");
	}
}
//subclass
class Dog extends Animal
{
	void run()
	{
		System.out.println("running");
	}
}

public class AbstractClassTest {

	public static void main(String[] arg)
	{
		Animal A=new Dog();
		A.run();
		A.catching();
	}
}

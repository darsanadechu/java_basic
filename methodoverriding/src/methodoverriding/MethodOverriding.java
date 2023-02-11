package methodoverriding;

//parent class
class Animals
{
	void print()
	{
		System.out.println("Eating");
	}
}
//subclass 1
class Dog extends Animals
{
	void print()
	{
		System.out.println("Barking");
	}
}
//subclass2
class BabyDog extends Animals
{
	void print()
	{
		System.out.println("Weeping");
	}
}
public class MethodOverriding {

	public static void main(String[] arg)
	{
		Dog D=new Dog();
		D.print();
		BabyDog B=new BabyDog();
		B.print();
	}
}

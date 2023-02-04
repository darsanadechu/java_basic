package bank;

class bankacnt
{
	int acntno;
	String name;
	float amount;
	void insert(int a,String n,float amt)
	{
		acntno=a;
		name=n;
		amount=amt;
	}
	void display()
	{
		System.out.println("Acnt no :"+acntno);
		System.out.println("Name :"+name);
		System.out.println("Amount :"+amount);
	}
	void deposit(int x)
	{
		amount=amount+x;
		System.out.println(x+" deposited");
	}
	void withdraw(int y)
	{
		if(amount<y)
			System.out.println("insufficient balance");
		else {
			amount-=y;
			System.out.println(y+" withdrawn");
		}
	}
	
}
public class bank {

	public static void main(String arg[]) {
		bankacnt b=new bankacnt();
		b.insert(875642, "darsana", 50000);
		b.display();
		b.deposit(10000);
		b.display();
		b.withdraw(20000);
		b.display();
		
	}
}

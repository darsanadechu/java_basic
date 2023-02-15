package encapsulation;

class Accnt
{
	//private data
	private int acntno;
	private float acntBalance;
	
	//getter functions
	int getacntno()
	{
		return acntno;
	}
	float getacntBalance()
	{
		return acntBalance;
	}
	//setter functions
	void setacntno(int acntno)
	{
		this.acntno=acntno;
	}
	void setacntBalance(float acntBalance)
	{
		this.acntBalance=acntBalance;
	}
	
}

public class BankAccount {

	public static void main(String[] arg)
	{
		Accnt A=new Accnt();
		A.setacntno(567578967);
		A.setacntBalance(5000);
		System.out.println("Accnt no : "+A.getacntno());
		System.out.println("Accnt balance : "+A.getacntBalance());
	}
}

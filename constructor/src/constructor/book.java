package constructor;
class bookdetails {
	private String name;
	private int price;
	private String author;
	bookdetails()
	{
		name="Othello";
		author="Shakespeare";
		price=100;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
	}
}

public class book {
	public static void main(String[] arg) {
bookdetails b=new bookdetails();
b.display();

	}
}

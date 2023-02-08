package assignment1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


class browserdetails {
	//array url declaration
	private static String[] url=new String[3];
	//empty constructor with set method
	browserdetails()
	{
		
	}
	//set method
	void sethistory() {
		//inputing array
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
			{
				Array.set(url, i, sc.next());
			}
	}
	//constructor with array as argument
	browserdetails(String[] url)
	{
		this.url=url;
	}
	//function for display
	void display()
	{
		System.out.println(Arrays.toString(url));
	}
	
}
public class browser {
	public static void main(String[] arg) {
		//call empty constructor
		browserdetails b1= new browserdetails();
		b1.display();
		b1.sethistory();
		b1.display();
		String[] a= new String[3];
		//input
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			a[i]= sc.next();
		}
		//call parameterized constructor
		browserdetails b2= new browserdetails(a);
		b2.display();
		
	}
}
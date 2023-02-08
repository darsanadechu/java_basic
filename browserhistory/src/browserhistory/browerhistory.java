package browserhistory;

import java.lang.reflect.Array;
import java.util.Scanner;


class browser {
	//array declaration
	private static String[] url=new String[10];
	int j=3;
	
	//empty constructor
	browser() {
	}

	//constructor with array as argument
	browser(String[] url)
	{
		this.url=url;
	}
	
	//using set method
	void setbrowserhistory(){
		//inputing array
		System.out.println("browse site");	
		Scanner sc=new Scanner(System.in);
		url[j]=sc.next();
		j++;
	}
	
	//display function
	void display()
	{
		for(int i=0;i<url.length;i++)
		{
			System.out.print(url[i]+" ");
		}
		System.out.println();
	}
	
}

public class browerhistory {

	public static void main(String[] arg) {
		boolean k;
		//call empty constructor
		browser b= new browser();
		b.display();
		String[] a= new String[10];
		//input
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			a[i]= sc.next();
		}
		//call parameterized constructor
		browser b1= new browser(a);
		b1.display();
		
		//check for next browsing
		Scanner input=new Scanner(System.in);
		System.out.println("want to browse more");
		k=input.nextBoolean();
		if(k)
		{
			do
			{
			b1.setbrowserhistory();
			b1.display();
			System.out.println("want to browse more");
			k=input.nextBoolean();
			}while(k);
		}
		System.out.println("Visited URLS");
		b1.display();
	}
}

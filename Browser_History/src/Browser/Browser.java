package Browser;

import java.util.Scanner;

class BrowserMenu 
{
	private static String[] url=new String[10];
	int choice,index=0,position;
	//parameterized constructor with input choice
	BrowserMenu(int choice) 
	{
		this.choice=choice;
		switch(choice)
		{
		case 1: addToHistory();
				break;
		case 2: deleteFromHistory();
				break;
		case 3: searchHistory();
				break;
		case 4: displayHistory();
				break;
		default: System.out.println("Invalid choice");
		}
	}
	//function for adding url
	void addToHistory() 
	{
		int flag=0;
		Boolean k;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("want to add more");
		k=sc.nextBoolean();
		if(k)
		{
			do
			{
			System.out.println("Enter the url to be added");
			str=sc.next();
			for(int i=0;i<url.length;i++)
				if(str.equals(url[i]))
					flag++;
			if(flag==0) 
			{
				url[index]=str;
				index++;
				System.out.println("url added");
			}
			else
				System.out.println("Already exsist");
			System.out.println("want to add more");
			k=sc.nextBoolean();
			}while(k);
		}
	}
	//function for deleting url
	void deleteFromHistory() 
	{
		System.out.println("enter the url position to be deleted");
		Scanner sc=new Scanner(System.in);
		position=sc.nextInt();
		for(int i=position-1;i<url.length-1;i++)
			url[i]=url[i+1];
		System.out.println("url deleted");	
	}
	//function for searching history
	void searchHistory()
	{
		System.out.println("enter the position to be searched");
		Scanner sc=new Scanner(System.in);
		position=sc.nextInt();
		String s=url[position-1];
		System.out.println("URL at "+position+" is "+s);
	}
	//function for display browsing history
	void displayHistory()
	{
		System.out.println("The browsing history is");
		for(int i=0;i<url.length;i++)
			System.out.println(url[i]);
		
	}
	
}

public class Browser {

	public static void main(String[] arg)
	{
		int i=1,choiceNumber=10;
		System.out.println("Press 1 : Add a url");
		System.out.println("Press 2 : Delete a url");
		System.out.println("Press 3 : Search a url");
		System.out.println("Press 4 : Display a url");
		while(i<choiceNumber) 
		{
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			BrowserMenu B=new BrowserMenu(choice);
			i++;
		}
	}
}

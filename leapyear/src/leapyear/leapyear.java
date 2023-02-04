
package leapyear;
import java.util.Scanner;
public class leapyear {
	public static void main(String arg[]) {
		System.out.println("enter a year");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(((x%4==0)&&(x%100!=0))||(x%400==0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("common year");
		}
		sc.close();
	}

}

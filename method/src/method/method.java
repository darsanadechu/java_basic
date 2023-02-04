package method;

public class method {
static int factorial(int n)
{
	if(n==0)
		return 1;
	else
		return(n*factorial(n-1));
	
}
public static void main(String arg[]) {
	int f;
	f=factorial(5);
	System.out.println("Factorial="+f);
}
}

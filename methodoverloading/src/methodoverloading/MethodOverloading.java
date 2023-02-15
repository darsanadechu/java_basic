package methodoverloading;

class AreaOverloading
{
	int a,b,r,h;
	//area of rectangle
	int area(int a,int b)
	{
		return(a*b);
	}
	//area of circle
	float area(int r)
	{
		return (float) (3.14*r*r);
	}
	//area of triangle
	float area(double b,double h)
	{
		return (float) (0.5*b*h);
	}
}

public class MethodOverloading {

	public static void main(String[] arg)
	{
		AreaOverloading A=new AreaOverloading();
		System.out.println("Area of rectangle of sides 5 and 4 is:"+A.area(5,4));
		System.out.println("Area of circle with radius 5 is:"+A.area(5));
		System.out.println("Area of triangle of base 3.2 and height 4.3 is:"+A.area(3.2,4.3));
	}
}

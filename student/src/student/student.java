package student;
class studentdetails
{
	int rollno;
	String name;
	void display()
	{
		System.out.println(rollno+" "+name);
	}
	
}

public class student {

	public static void main(String arg[]) {
		studentdetails st1=new studentdetails();
		studentdetails st2=new studentdetails();
		st1.rollno=22;
		st1.name="darsana";
		st2.rollno=11;
		st2.name="anjana";
		st1.display();
		st2.display();
	}
}

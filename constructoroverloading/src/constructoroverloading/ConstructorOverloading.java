package constructoroverloading;

class Employee
{
	int empid, yearofjioining;
	String name, company;
	public String yearofjoining;
	
	Employee(int empid,int yearofjoining)
	{
		this.empid=empid;
		this.yearofjioining=yearofjoining;
	}
	Employee(String name,String company)
	{
		this(7160,2023);
		this.name=name;
		this.company=company;
	}
}

public class ConstructorOverloading {
	public static void main(String[] arg)
	{
		Employee E=new Employee("Darsana","Zoho");
		System.out.println("empid:"+E.empid);
		System.out.println("comapany:"+E.company);
		System.out.println("name:"+E.name);
		System.out.println("year of joining:"+E.yearofjoining);
	}

}

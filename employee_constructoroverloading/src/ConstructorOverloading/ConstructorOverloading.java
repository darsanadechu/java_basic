package ConstructorOverloading;

class Employee
{
	int empID, yearOfJoining;
	String name, company;
	
	Employee(int empID,int yearOfJoining)
	{
		this.empID=empID;
		this.yearOfJoining=yearOfJoining;
	}
	Employee(String name,String company)
	{
		this(7160, 2023);
		this.name=name;
		this.company=company;
	}
}

public class ConstructorOverloading {
	public static void main(String[] arg)
	{
		Employee Employee1=new Employee("Darsana","Zoho");
		System.out.println("empid:"+Employee1.empID);
		System.out.println("comapany:"+Employee1.company);
		System.out.println("name:"+Employee1.name);
		System.out.println("year of joining:"+Employee1.yearOfJoining);
	}

}
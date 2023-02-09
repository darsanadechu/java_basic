package aggregation;

class address {
	static String city;
	static String state;
	static String country;
	address(String city,String state,String country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
}

class student {
	String name;
	int rollno;
	address add;
	void set(String name,int rollno,address add) {
		this.name=name;
		this.rollno=rollno;
		this.add=add;
	}
	void display() {
		System.out.println(name+" "+rollno);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
}

public class aggregation {

	public static void main(String[] arg) {
		address add1=new address("thodupuzha","kerala","india");
		address add2=new address("kothamangalam","kerala","india");
		student s1=new student();
		student s2=new student();
		s1.set("darsana", 22, add1);
		s1.display();
		s2.set("anjana", 11, add2);
		s2.display();
	}
}

package inheritance;

//super class
class person {
	String name="darsana";
	int age=21;
	void display() {
		System.out.println("name:"+name+" age:"+age);
	}
}

//sub class1
class programmer extends person {
	void print() {
	System.out.println("Programming");
	}
}

//subclass2
class dancer extends person {
	void print() {
	System.out.println("Dancing");
	}
}

public class inheritance {

	public static void main(String[] arg) {
		programmer p=new programmer();
		p.display();
		p.print();
		dancer d=new dancer();
		d.display();
		d.print();
		
	}
}

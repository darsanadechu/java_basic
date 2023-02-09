package objectclass;

public class objectclass {

	public static void print(Object obj) {
		if(obj instanceof Integer)
			System.out.println(obj+" is of type int");
		else if (obj instanceof Float)
			System.out.println(obj+" is of type float");
		else if (obj instanceof String)
			System.out.println(obj+" is of type string");
		else
			System.out.println(obj+" is of "+obj.getClass().getTypeName()+" type");
	}
	public static void main(String[] arg) {
		print(5);
		print(3.5f);
		print("darsana");
		print(5.5d);
	}
}

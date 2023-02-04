package thirdlargest;

public class thirdlargest {

	public static int thirdlargest(int[] a,int l) {
		int i,j,temp;
		for(i=0;i<l;i++)
			for(j=i+1;j<l;j++)
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		return a[l-3];
	}
	public static void main(String arg[]) {
		int a[]= {1,8,3,4,6,7,5};
		int b[]= {7,3,9,4,5,2};
		System.out.println(thirdlargest(a,a.length));
		System.out.println(thirdlargest(b,b.length));
	}
}

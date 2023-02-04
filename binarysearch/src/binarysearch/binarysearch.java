package binarysearch;
import java.util.Arrays;

public class binarysearch {

	public static void main(String[] arg) {
		
		int[] a= {1,8,6,3,9,4,7};
		//sort
		Arrays.sort(a);
		System.out.println("sorted array");
		for(int j:a)
			System.out.print(j+" ");
		int i=Arrays.binarySearch(a,3);
		System.out.println();
		System.out.println("3 is found at index "+i);
		
		//compare
		int[] b= {1,2,3,4,5};
		int[] c= {1,2,3,4};
		System.out.println("comparison "+Arrays.compare(b, c));
		
		//to print in one line
		System.out.println("arra b: "+Arrays.toString(b));
		
		//copy
		int[] d=Arrays.copyOf(b, 10);
		System.out.println("array d: "+Arrays.toString(d));
		
		//fill
		Arrays.fill(b, 1);
		System.out.println("filled array "+Arrays.toString(b));
		
		//get mismatched location
		System.out.println("mismatched index of b&d "+Arrays.mismatch(b, d));
	}
}
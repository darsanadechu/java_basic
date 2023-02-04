package addmatrix;

public class addmatrix {

	public static void main(String arg[]) {
		int i,j;
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{9,8,7},{6,5,4}};
		int c[][]=new int[2][3];
				
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

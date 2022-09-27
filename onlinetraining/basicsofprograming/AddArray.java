package basicsofprograming;

public class AddArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		
		int x[]=new int[4];
		
		int i,j;
		for( i=0;i<a.length;i++)
		{
			for( j=i;j<=i;j++)
			{
				x[i]=a[i]+b[j];
				System.out.println(x[i]);
			}
		}
		
		
	}

}

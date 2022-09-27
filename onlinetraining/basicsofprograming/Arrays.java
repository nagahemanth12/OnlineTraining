package basicsofprograming;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		
		int x[]=new int[4];
		
		for( int i=0;i<a.length;i++)
		{
		
				x[i]=a[i]+b[i];
				System.out.println(x[i]);
		}
		
	}

}

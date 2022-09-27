package basicsofprograming;

public class Functions {
	public static void main(String[] args) {
		Functions obj=new Functions();
				int sum=obj.add(20,40);
				System.out.println("The addition of the given number is:"+sum);
				int substract=obj.sub(100,40);
				System.out.println("The substraction of the given number is:"+substract);
				obj.mult(4, 5);
				obj.divide(10,2);
		
	}
	int add(int a,int b)
	{
		int sum;
		sum=a+b;
		return sum;
		
	}
	int sub(int a,int b)
	{
		int sub;
		sub=a-b;
		return sub;
		
	}
	void mult(int a,int b)
	{
		int mult;
		mult=a*b;
		System.out.println("The multiplication of the given number is:"+mult);
	}
	void divide(int a,int b)
	{
		int divide;
		divide=a/b;
		System.out.println("The division of the given number is:"+divide);
	
		
	}
	

}

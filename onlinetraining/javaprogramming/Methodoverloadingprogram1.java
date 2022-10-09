package javaprogramming;

public class Checking {
	void main()
	{
		System.out.println("User defined 1");
	}
	void main(int a)
	{
		System.out.println("user defined 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Predefined 2");
		Checking obj=new Checking();
		obj.main();
		obj.main(10);
		
	}
		
		

	}



package javaprogramming;
	class Login 
	{
		void loginn()
		{
			System.out.println("Login Successfully");	
		}
	}
	
	public class AddBen extends Login {

		void afterlogin() 
		{
			System.out.println("Add benificiary");
		}
		
			public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				AddBen add = new AddBen();
				add.loginn();
				add.afterlogin();
				
			
		}
	}



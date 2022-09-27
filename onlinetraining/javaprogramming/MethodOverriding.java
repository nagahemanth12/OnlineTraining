package javaprogramming;

class Animals
{
	void animal()
	{
		System.out.println("All the animals are their");
	}
}
public class MethodOverriding extends Animals {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Animals obj1= new Animals();
		//obj1.animal();
	MethodOverriding obj=new MethodOverriding();
	obj.animal();
	}
	
	void animal()
	{
		super.animal();
		System.out.println("Only dogs are their");;
	}
}
	



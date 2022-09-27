package javaprogramming;

class Students
{
	void student()
	{
		System.out.println("All the Student are Present");
	}
}
public class overriding extends Students {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		overriding obj=new overriding();
	obj.student();
	}
	void student()
	{
		super.student();
		System.out.println("A group of students are present");;
	}
}
	


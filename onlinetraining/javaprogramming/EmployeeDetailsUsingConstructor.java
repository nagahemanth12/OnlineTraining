package javaprogramming;

public class EmployeeDetails {
	String emp_name;
	int emp_id;
	int emp_sal;
	String emp_design;


	public static void main(String[] args) {
		EmployeeDetails obj=new EmployeeDetails("Hemanth",1234,45000,"Trainee");
		EmployeeDetails obj1=new EmployeeDetails("shiva",4564,35000,"Trainee Software engineer");
		EmployeeDetails obj2=new EmployeeDetails("Hemanth",12472,50000,"Associate engineer");
		obj.Display();
		obj1.Display();
		obj2.Display();
		
		// TODO Auto-generated method stub
	}
		 EmployeeDetails( String name,int empid,int emp_sal1,String Desn)
		{
		emp_name=name;
		emp_id=empid;
		emp_sal=emp_sal1;
		emp_design=Desn;
	}
	void Display()
	{
		System.out.println("The employee name is:"+emp_name);
		System.out.println("The employee id is reffered to:"+emp_id);
		System.out.println("The salary of the employee is:"+emp_sal);
		System.out.println("The role of the Employee"+emp_design);
		
	}

}

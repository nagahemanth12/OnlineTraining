package javaprogramming;

public class Static {
	String empname;
	int empid;
	long empsalary;
	String empdesig;
	static String companyname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			

			
				Static emp1 = new Static();
				emp1.init("Hemanth",123, 30000,"Associate trainee");
				initstaticData();
				emp1.display();
				Static emp2 = new Static();
				emp2.init("Anil",245, 450000,"System engineer");
				initstaticData();
				emp2.display();
				Static emp3 = new Static();
				emp3.init("Kiran",190, 60000,"trainee System engineer");
				initstaticData();
				emp3.display();

			}
			void init(String empname_temp, int empid_temp, int empsalary_temp, String empdesig_temp) {
				empname = empname_temp;
				empid = empid_temp;
				empsalary = empsalary_temp;
				empdesig = empdesig_temp;
			}
			static void initstaticData()
			{
				companyname="TietoEVRY";
			}
			
			void display() {
				System.out.println("The Name Of the Company: "+companyname);
				System.out.println("Employee name : "+empname);
				System.out.println("Employee ID : "+empid);
				System.out.println("Employee salary : "+empsalary);
				System.out.println("Employee designation : "+empdesig);
				System.out.println("--------------------------------------");
			}
			static 
			{
				System.out.println("Employee details:");
			}
			


		}



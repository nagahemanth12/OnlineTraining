package secondpackage;

class Parent {
	void m1()
	{
		System.out.println("Login Successfully");
	}
}

 class Child extends Parent{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.m1();
		obj.m2();
	}
		void m2()
		{
			System.out.println("Login Successfully");
		}
	}



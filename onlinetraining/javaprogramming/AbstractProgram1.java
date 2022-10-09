package javaprogramming;

abstract class Abc
{
	abstract void m1();
	void method()
	{
		System.out.println("Its an normal method in abstract class");
	}
	}


public class Abstract1 extends Abc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract1 obj=new Abstract1();
		obj.m1();
		obj.method();
	}
		void m1()
		{
			System.out.println("Its an abstract class!");
		}
		
	}

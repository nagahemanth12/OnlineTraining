package javaprogramming;
 abstract class Xyz{

		abstract void me1();
		void method1()
		{
			System.out.println("Its an normal method");
		}
}
	public class AbstractImp extends Xyz{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AbstractImp obj=new AbstractImp();
			obj.me1();
			//obj.method1();
			obj.me2();
		}
			void me1()
			{
				System.out.println("Its an abstract class!");
			}
			void me2()
			{
				System.out.println("Its an subclass method");
			}
			
		}

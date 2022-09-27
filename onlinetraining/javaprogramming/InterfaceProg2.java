package javaprogramming;

	interface inter1
	{
		void meth1();
	}
	interface inter2 extends inter1
	{
		void meth2();
	}
	
	public class InterfaceProg2  implements inter1,inter2{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			InterfaceProg2 obj= new InterfaceProg2();
			obj.meth1();
			obj.meth2();

		}
		 public void meth1()
		{
			System.out.println("Its an Interface 1");
		}
		 public void meth2()
		{
			System.out.println("Its an Interface 2");
		}
		

}

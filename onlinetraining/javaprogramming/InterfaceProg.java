package javaprogramming;

interface interface1
{
	void meth();
}
public class InterfaceProg  implements interface1{

	public static void main(String[] args) {
		
		InterfaceProg obj= new InterfaceProg();
		obj.meth();

	}
	public void meth()
	{
		System.out.println("Its an Interface");
	}

}

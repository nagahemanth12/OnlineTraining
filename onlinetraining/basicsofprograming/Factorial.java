package basicsofprograming;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=4;
		int fact=1;
		int i=1;
		while(i<=number)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("The factorial of the given number is:"+fact);

	}

}

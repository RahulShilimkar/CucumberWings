package BasicPackage;

public class Methods {

	public void add(int a , int b)
	{
		int result = a + b;
		System.out.println("Sum value is "+result);
	}
	
	public void subtract(int a , int b)
	{
		int subtract = a - b;
		System.out.println("Subtraction value is "+subtract);
	}
	
	public int multiply(int a , int b)
	{
		return a*b;
	}
	
	public String intro()
	{
		return "Hello, we are using methods from other classes";
	}
}

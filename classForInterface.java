package BasicPackage;
//public class classForInterface implements interfaceTestingJava
//Above is implementing single interface
//Below is implementing multiple interface
public class classForInterface implements interfaceTestingJava,SecondInterface{
	
	public static void adds(int a , int b)
	{
		int result;
		result = a +b;
		System.out.println("Addition is "+result);
	}
	
	public void subtract(int a , int b)
	{
		int result;
		result = a - b;
		System.out.println("Subtraction is "+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceTestingJava a = new classForInterface();
		//Above step is object creation to access the methods in interfaceTestingJava inside classForInterface.
		
		classForInterface b = new classForInterface();
		//Above step is alternate way to access methods in classForInterface Classes created inside same class.
		
		SecondInterface c = new classForInterface();
		//Above step is object creation to access the methods in SecondInterface inside classForInterface.
		
		a.redStop();
		a.greenGo();
		a.yellowSlow();
		adds(3,5);
		b.subtract(5,2);
		System.out.println(interfaceTestingJava.num1);
		System.out.println(num2);
		adds(num1,num2);
		c.fridge();
		c.sonar();
		adds(num3,num4);
	}
// We are implementing methods in Class but defining them in Interface
@Override
public void greenGo() {
	// TODO Auto-generated method stub
	System.out.println("Green");
}

@Override
public void redStop() {
	// TODO Auto-generated method stub
	System.out.println("Red");
}

@Override
public void yellowSlow() {
	// TODO Auto-generated method stub
	System.out.println("Yellow");
}

@Override
public void fridge() {
	System.out.println("Keeping stuffs cool");
	
}

@Override
public void sonar() {
	System.out.println("Keeping stuffs warm");
}

}

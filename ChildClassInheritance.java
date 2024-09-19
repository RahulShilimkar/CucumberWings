package BasicPackage;

//extends -> Helps in extending/taking/inheriting methods from parent classes.
//implements -> Helps in implementing methods from interface's.
//JAVA does not allow multiple inheritance like inerface's.
public class ChildClassInheritance extends ParentClassInheritance
{
	public void engine()
	{
		System.out.println("New Engine are setup using child/own class");
	}
	public void colour()
	{
		System.out.println("Colour defined in parent class is :- "+colour);
		//Colour is defined in parent class being used by child class.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassInheritance cd = new ChildClassInheritance();
		cd.engine();
		cd.colour();
		cd.brakes();
		cd.gear();

	}

}

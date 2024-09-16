package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	//@Before
	//This will make test to run this before running any step/test, the main thing is it is not confined to One feature file like background it is accessible everywhere in project
	//Order of Execution:- Before>Background>Scenario>After.	
	@Before("@LoginTest") //This will make this Before specific to LoginTest use case.
	public void LoginTestSetup()
	{
		System.out.println("Doing a Login Test");
	}
	@Before("@FormTest") //This will make this Before specific to FormTest use case.
	public void FormTestSetup()
	{
		System.out.println("Filling the form details");
	}
	@After
	public void tearDown()
	{
		System.out.println("Closing the test's");
	}
	@After("@FormTest")
	public void tearDownForm()
	{
		System.out.println("Closing the test's for formTest");
	}
}

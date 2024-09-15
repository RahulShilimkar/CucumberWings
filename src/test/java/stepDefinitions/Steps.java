package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	 @Given("User is on Netbanking login page")
	 public void user_is_on_netbanking_login_page() {
	     System.out.println("User is on Netbanking login page");
	 }
//	 @When("User login into application")
//	 public void user_login_into_application() {
//		 System.out.println("User login into application");
//	 }
	 
	 @When("User login into application with username {string} and password {string}")
	 public void user_login_into_application_with_username_and_password(String username, String password) {
	     System.out.println("We have associate - "+username+" who has logged in with password as "+password);
	 }
	 
//	 @When("User login into application with username {string} and password {string} combination")
//	 public void user_login_into_application_with_username_and_password_combination(String username, String password) {
//	     System.out.println("We have associate - "+username+" who has logged in with password as "+password);
//	 }
	 
	 @When("^User login into application with username (.+) and password (.+) combination$")
	 public void user_login_into_application_with_username_and_password_combination(String username, String password) {
	     System.out.println("We have associate - "+username+" who has logged in with password as "+password +" combination");
	     
	 }
	 
	 @Then("Home Page is displayed")
	 public void home_page_is_displayed() {
		 System.out.println("Home Page is displayed");
	 }
	 @Then("Cards are displayed")
	 public void cards_are_displayed() {
		 System.out.println("Cards are displayed now");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


	}

}

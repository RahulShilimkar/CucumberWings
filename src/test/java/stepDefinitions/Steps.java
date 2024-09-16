package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	 @Given("User is on Netbanking login page")
	 public void user_is_on_netbanking_login_page() {
	     System.out.println("User is on Netbanking login page");
	 }
	 
	 @Given("User is on practice landing page")
	 public void user_is_on_practice_landing_page() {
	     System.out.println("On datadriver homepage");
	 }
	 
	 @When("User signs up into application")
	 public void user_signs_up_into_application(List<String> formValue) {
	     System.out.println(formValue.get(0));
	     System.out.println(formValue.get(1));
	     System.out.println(formValue.get(2));
	     System.out.println(formValue.get(3));
	 }
//	 @When("User signs up into application")
//	 public void user_signs_up_into_application(io.cucumber.datatable.DataTable dataTable) {
//	     // For automatic transformation, change DataTable to one of
//	     // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	     // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	     // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	     // For other transformations you can register a DataTableType.
//	     throw new io.cucumber.java.PendingException();
//	 }
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

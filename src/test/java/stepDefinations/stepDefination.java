package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDefination {

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() {
		//code to to naviagate to landing page
		System.out.println("User is on landing page");
	}
	
	//@When("^User login into application with username & password$")
	//public void user_login_into_application_with_username_password() {
		//login with username & pass
	//	System.out.print("logged in using username & password");
	//}
	
	
	@When("^User login into application with username \"([^\"]*)\" & password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_password(String arg1, String arg2) {
	    System.out.println(arg1+"	"+arg2);
	}

	
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		//homepage
		System.out.println("home page populated");
	}
	
	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1){
		System.out.println(arg1);
	}
	
	
}

package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class stepDefination {

	public static Logger log=LogManager.getLogger(stepDefination.class.getName());
	public static WebDriver driver;

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() {
		//code to to naviagate to landing page
		System.out.println("User is on landing page");
		log.info("User is on landing page");
		
		System.setProperty("webdriver.chrome.driver", "//home//vsts//work//1//s//src//chromedriver");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--ChromelessOptions");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
		options.add_argument("--remote-debugging-port=9222")
		chromeOptions.addArguments("--disable-dev-shm-usage");
		driver = new ChromeDriver(chromeOptions);
		log.info("Opening google.co.in");
		log.info("Window maximized");
		driver.get("https://www.google.co.in/");
		log.info("Window title:"+driver.getTitle());
		log.info("Current URL:"+driver.getCurrentUrl());
	}
	
	//@When("^User login into application with username & password$")
	//public void user_login_into_application_with_username_password() {
		//login with username & pass
	//	System.out.print("logged in using username & password");
	//}
	
	
	@When("^User login into application with username \"([^\"]*)\" & password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_password(String arg1, String arg2) {
	    System.out.println(arg1+"	"+arg2);
	    log.info("User "+arg1+" login into application");
	}

	
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		//homepage
		System.out.println("home page populated");
		log.info("home page populated");
	}
	
	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1){
		System.out.println(arg1);
		log.info("cards displyed");
	}
	
	
}

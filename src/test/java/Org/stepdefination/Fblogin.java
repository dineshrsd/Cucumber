 package Org.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import Org.base.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin extends Baseclass{
	@Given("to launch chrome browser and maximise the window")
	public void to_launch_chrome_browser_and_maximise_the_window() {
	    launchbrowser();
	    windowMaximize();
	}

	@When("to launch the application of facebook url")
	public void to_launch_the_application_of_facebook_url() {
	   launchUrl("https://www.facebook.com/");
	}

	@When("to pass the valid username on email field")
	public void to_pass_the_valid_username_on_email_field() {
	   WebElement email = driver.findElement(By.id("email"));
	   sendKeys(email, "rajdinesh@yahoo.com");
	}

	@When("to pass the invalid passowrd on password field")
	public void to_pass_the_invalid_passowrd_on_password_field() {
	   WebElement pass = driver.findElement(By.id("pass"));
	   sendKeys(pass, "1233456");
	}

	@When("to click the login button")
	public void to_click_the_login_button() {
	   driver.findElement(By.name("login")).click();
	}

	@When("to check the navigate to home page or not")
	public void to_check_the_navigate_to_home_page_or_not() {
	   System.out.println("To check login credentional");
	}

	@Then("to closed the browser")
	public void to_closed_the_browser() {
	   closeEntirebrowser();
	}


}

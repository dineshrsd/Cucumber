package Org.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Org.base.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Positivenagitivefblogiin extends Baseclass{
	@Given("user has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
	   launchbrowser();
	   windowMaximize();
	}

	@When("user has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
	   launchUrl("https://www.facebook.com/");
	}

	@When("user has to pass the data {string}in email textfield")
	public void user_has_to_pass_the_data_in_email_textfield(String email) {
		 WebElement emai = driver.findElement(By.id("email"));
		   sendKeys(emai,email);
	}

	@When("user has to pass the data{string} in password textfield")
	public void user_has_to_pass_the_data_in_password_textfield(String password) {
		WebElement pass = driver.findElement(By.id("pass"));
		   sendKeys(pass, password);
	}

	@When("user has to click on login button")
	public void user_has_to_click_on_login_button() {
		   driver.findElement(By.name("login")).click();

	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
	    closeEntirebrowser();
	}



}

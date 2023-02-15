package Org.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Org.base.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Icicilogin extends Baseclass{
	@Given("launch the chrome browser and maximize window")
	public void launch_the_chrome_browser_and_maximize_window() {
	   launchbrowser();
	   windowMaximize();
	}

	@When("To launch the application icici url")
	public void to_launch_the_application_icici_url() {
	   launchUrl("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_gl=1*30xkeg*_ga*MTgzMDcxOTY5Ni4xNjIwMDM5NDU0*_ga_SKB78GHTFV*MTYyODIzNDM4NC43Ny4xLjE2MjgyMzQ1MDQuMjc.&_ga=2.15973366.1179124605.1628150213-1830719696.1620039454");
	 WebElement user = driver.findElement(By.xpath("(//input[@id='DUMMY1'])[1]"));
	   Action();
	   a.click(user).perform();
 	}

	@When("to pass the invalid data userid text field")
	public void to_pass_the_invalid_data_userid_text_field() {
	 WebElement userid = driver.findElement(By.xpath("(//input[@id='AuthenticationFG.USER_PRINCIPAL'])[1]"));
	 sendKeys(userid, "1234567");
	}

	@When("to pass the invalid data password text field'")
	public void to_pass_the_invalid_data_password_text_field() {
	  WebElement password = driver.findElement(By.xpath("(//input[@id='AuthenticationFG.ACCESS_CODE'])[1]"));
	  sendKeys(password, "ijklmnop");
	}

	@When("to click on login button")
	public void to_click_on_login_button() {
	 WebElement login = driver.findElement(By.xpath("(//input[@id='VALIDATE_CREDENTIALS1'])[1]"));
	 clickBtn(login);
	}

	@Then("To the chrome browser")
	public void to_the_chrome_browser() {
	closeEntirebrowser();   	
	}


}

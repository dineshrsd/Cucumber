package Org.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Org.base.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Myntralogin extends Baseclass{

@Given("to launch the chrome browser and maximize window")
public void to_launch_the_chrome_browser_and_maximize_window() {
   launchbrowser();
   windowMaximize();
}

@When("To launch the test url")
public void to_launch_the_test_url() {
    launchUrl("https://www.myntra.com/login?referer=https://www.myntra.com/");
}

@When("To pass the invalid number on text field and click continue button")
public void to_pass_the_invalid_number_on_text_field_and_click_continue_button() {
   WebElement mobilenumber = driver.findElement(By.xpath("(//input[@type='tel'])[1]"));
   sendKeys(mobilenumber, "1234567899");
  WebElement continubtn = driver.findElement(By.xpath("(//div[@class='submitBottomOption'])[1]"));
  clickBtn(continubtn);
}

@Then("close broswer")
public void close_broswer() {
   closeEntirebrowser();
}


}

package Org.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Org.base.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bistobits extends Baseclass {

	//scenario-1
	@Given("The user enters the testing site.")
	public void the_user_enters_the_testing_site() {
		launchbrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("click the Account button.")
	public void click_the_Account_button() throws InterruptedException {
		WebElement account = driver.findElement(By.xpath("//div[@class='lte-navbar-icons']//li[contains(@class,'lte-nav-profile')]//a"));
		clickBtn(account);
		Thread.sleep(8000);
	}

	@When("the wrong Username and Password.")
	public void the_wrong_Username_and_Password() {
		WebElement phone = driver.findElement(By.id("phone"));
		sendKeys(phone, "8899776655");
		WebElement password = driver.findElement(By.id("password"));
		sendKeys(password, "12345");
	}

	@When("click the login button.")
	public void click_the_login_button() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]"));
		clickBtn(login);
		Thread.sleep(8000);
	}

	@Then("check the output Invalid Mobile No.")
	public void check_the_output_Invalid_Mobile_No() {
		WebElement invalid = driver.findElement(By.xpath("(//li[normalize-space()='Invaild Mobile No'])[1]"));
		System.out.println(invalid.getText());
	}

	@Given("that I am logged in as a user and on the home page.")
	public void that_I_am_logged_in_as_a_user_and_on_the_home_page() throws InterruptedException {
		WebElement home = driver.findElement(By.xpath("//li[@id='menu-item-14249']//a"));
		clickBtn(home);
		Thread.sleep(8000);
	}
	//scenaruio-2
	@When("i see the HOME button on the page and click it.")
	public void i_see_the_HOME_button_on_the_page_and_click_it() throws InterruptedException {
		WebElement home = driver.findElement(By.xpath("//li[@id='menu-item-14249']//a"));
		clickBtn(home);
		Thread.sleep(8000);
	}

	@When("I see a dropdown labeled Dosa.")
	public void i_see_a_dropdown_labeled_Dosa() {
		WebElement dosa = driver.findElement(By.xpath("(//a[@class='lte-item'])[4]"));
		scroll(dosa);
	}

	@When("Click the dosa button.")
	public void click_the_dosa_button() throws InterruptedException {
		WebElement dosa = driver.findElement(By.xpath("(//a[@class='lte-item'])[4]"));
		clickBtn(dosa);
		Thread.sleep(8000);
	}

	@When("select the MasalaDosa option.")
	public void select_the_MasalaDosa_option() throws InterruptedException {
		WebElement masaladosa = driver.findElement(By.xpath("(//h2[normalize-space()='Masala Dosa'])[1]"));
		clickBtn(masaladosa);
		Thread.sleep(8000);
	}

	@Then("Enter the page and check the Available Time.")
	public void enterThePageAndCheckTheAvailableTime() {
		System.out.println("check the avaliability timing");

	}

	//scenario-3
	@When("Fill out the registration form with dummy data name, phone number and email.")
	public void fill_out_the_registration_form_with_dummy_data_name_phone_number_and_email() {
		WebElement name = driver.findElement(By.xpath("(//input[@id='name'])[1]"));
		sendKeys(name, "dinesh");

		WebElement email = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
		sendKeys(email, "dinesh@gmail.com");

		WebElement phonenum = driver.findElement(By.xpath("(//input[@id='phone'])[2]"));
		sendKeys(phonenum, "8877665544");
	}

	@When("Skip the confirm password text label.")
	public void skip_the_confirm_password_text_label() {
		System.out.println("check");

	}

	@When("click the register button.")
	public void click_the_register_button() {
		WebElement regbtn = driver.findElement(By.xpath("(//button[normalize-space()='Register'])[1]"));
		clickBtn(regbtn);
	}

	@Then("Get the pop-up Please fill out the field")
	public void get_the_pop_up_Please_fill_out_the_field() {
		System.out.println("check out the fill out field");

	}

	//scenario-4
	@When("Click the search icon.")
	public void clickTheSearchIcon() {
		WebElement search = driver.findElement(By.xpath("(//a[@id='lte-top-search-ico'])[1]"));
		scroll(search);
		clickBtn(search);
	}

	@Then("search Coke and check the can dollar is $ {double}.")
	public void searchCokeAndCheckTheCanDollarIs$(Double double1) {
		WebElement searchbox = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
		sendKeys(searchbox, "coke");
		searchbox.submit();
	}

	//scenario-5
	@Given("Find out the Spanish Omelet and Click the icon.")
	public void find_out_the_Spanish_Omelet_and_Click_the_icon() {
		WebElement searchbox = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
		sendKeys(searchbox, "Spanish Omelet");
		searchbox.submit();
		WebElement spomlite = driver.findElement(By.xpath("(//h2[normalize-space()='Spanish omelet'])[1]"));
		clickBtn(spomlite);
	}

	@When("Select the option by probability.")
	public void select_the_option_by_probability() {
		WebElement selecttpro = driver.findElement(By.xpath("(//label[normalize-space()='avocado'])[1]"));
		clickBtn(selecttpro);
	}

	@Then("check the dollar probability.")
	public void check_the_dollar_probability() throws InterruptedException {
		System.out.println("check dollor probalitty");
		Thread.sleep(8000);
	}
    //scenario-6
	@Given("Click the OurStory option.")
	public void click_the_OurStory_option() {
		WebElement ourstory = driver.findElement(By.xpath("(//a[@href='https://bistrobitesdc.com/aboutus'])[1]"));
		clickBtn(ourstory);
	}

	@Then("Check the spelling mistake.")
	public void check_the_spelling_mistake() {
		System.out.println("check mistakes");

	}




}
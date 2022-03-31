package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Pages.HomePage;
import Pages.MyAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
	public WebDriver driver;
    public HomePage HP;
    public Base base;
    public MyAccountPage Account;
    
 

	@Given("I Open the browser")
	public void i_open_the_browser() {
		 System.setProperty("webdriver.chrome.driver", "chromedriver");
		 driver = new ChromeDriver();
	     HP= new HomePage(driver);
	     Account = new MyAccountPage(driver);
	}


	@Given("Go to website {string}")
	public void go_to_website(String BaseUrl) {

		driver.get(BaseUrl);
		driver.manage().window().maximize();
	    HP.acceptCookies();
	
	}
	
	@Given("Click on register option")
	public void click_on_register_option() {
		HP.select_signInOption();

	}
	
	@Given("Click on Create Account option")
	public void click_on_create_account_option() {
        HP.select_createAccount();
	}
	
	@Given("I accept the terms and conditions")
	public void i_accept_the_terms_and_conditions() {
		HP.TNC();

	}
	
	@Given("I click on create an account button")
	public void i_click_on_create_an_account_button() {
		HP.createAccount();

	}
	
	@Then("Error message for blank field is displayed")
	public void error_message_for_blank_field_is_displayed() {
		HP.validateBlankFieldMessage();

	}

	@When("I enter invalid email {string}")
	public void i_enter_invalid_email(String email) {
		HP.enter_email(email);

	}

	@When("I enter password {string}")
	public void i_enter_password(String string) {
		HP.enterPass(string);
	}

	@Then("Error message for invalid email address is displayed")
	public void error_message_for_invalid_email_address_is_displayed() {
        HP.validateInvalidEmailError();
	}

	@When("I enter valid email")
	public void i_enter_valid_email() {
		HP.enterValidEmail(base.RandomEmail()+"@gmail.com");
	}



	@Then("Error message for invalid password is displayed")
	public void error_message_for_invalid_password_is_displayed() {
	       HP.validateInvalidPassError();
	}

	

	@Then("Error message for not accepting terms and condition is displayed")
	public void error_message_for_not_accepting_terms_and_condition_is_displayed() {
		HP.validateTNCError();

	}


	@Then("User is succesfully registered and redirected to my account page")
	public void user_is_succesfully_registered_and_redirected_to_my_account_page() {
       HP.ValidateMyAccountPage();
	}


	@Then("Close the browser")
	public void close_the_browser() {
      HP.driver.close();
	}

	//steps for adding new address
	
	@When("I click on Add new address option")
	public void i_click_on_add_new_address_option() {
	 Account.selectNewAddressOption();
	 
	}
	
	@When("I enter AddressType")
	public void i_enter_address_type() {
	   Account.selectAddressType();
	}
	@When("I enter First Name as {string}")
	public void i_enter_first_name_as(String string) {
	   Account.EnterFirstName(string);
	}
	
	
	@When("I enter Last Name as {string}")
	public void i_enter_last_name_as(String string) {
	   Account.EnterLastName(string);
	}
	
	
	@When("I enter Address1 as {string}")
	public void i_enter_address1_as(String string) {
	  Account.EnterAddress1(string);
	}
	
	@When("I enter Address2 as {string}")
	public void i_enter_address2_as(String string) {
	Account.EnterAddress2(string);
	}
	
	@When("I enter city as {string}")
	public void i_enter_city_as(String string) {
	   Account.EnterCity(string);
	}
	
	
	@When("I enter Postcode as {string}")
	public void i_enter_postcode_as(String string) {
	   Account.EnterPostalCode(string);
	}
	
	
	@When("I enter Country as {string}")
	public void i_enter_country_as(String string) {
	    Account.SelectCountry(string);
	}
	
	@When("I click on save Address button")
	public void i_click_on_save_address_button() {
	    Account.saveAddress();
	}
	
	
	@Then("new address is added")
	public void new_address_is_added() {
	   Account.ValidateAddressisAdded();
	}







}

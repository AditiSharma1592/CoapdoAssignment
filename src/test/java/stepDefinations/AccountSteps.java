package stepDefinations;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.MyAccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSteps {
	public WebDriver driver;
    public HomePage HP;
    public Base base;
    public MyAccountPage Account;

	
    
    
	@When("I click on Add new address option")
	public void i_click_on_add_new_address_option() {
	 Account = new MyAccountPage(driver);
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

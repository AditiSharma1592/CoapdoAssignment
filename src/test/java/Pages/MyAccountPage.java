package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage {
	public WebDriver driver;
	   
	 public MyAccountPage(WebDriver driver)
	{
		this.driver=HomePage.driver;	
	}
	

	
By AddressBookLink =By.xpath("//a[@data-testid='/myaccount/addressbook?storeId=30027&langId=44&catalogId=10151']");
By AddAddressButton =By.xpath("//button[@data-testid='address-add-button']");
By Radio_DeliveryAdd =By.id("deliveryAddress_new");
By TextBox_firstName = By.id("firstName");
By TextBox_LastName = By.id("lastName");
By TextBox_Add1 = By.id("address1");
By TextBox_Add2 = By.id("address2");
By TextBox_City =By.id("city");
By TextBox_ZipCode = By.id("zipCode");
By Dropdown_Country = By.id("country");
By SaveAddress = By.xpath("//button[@data-testid='address-save-button']");
By AddressDeleteButton =By.xpath("//button[@data-testid='address-delete-button']");
By CloseSignUpButton = By.xpath("//button[@data-testid='modal-close-btn']");

//Actions

public void EnterFirstName(String FirstName) {
	driver.findElement(TextBox_firstName).sendKeys(FirstName);
}
	
public void EnterLastName(String LastName) {
	driver.findElement(TextBox_LastName).sendKeys(LastName);
}

public void EnterPostalCode(String Zip) {
	driver.findElement(TextBox_ZipCode).sendKeys(Zip);
}

public void EnterCity(String city) {
	driver.findElement(TextBox_City).sendKeys(city);
}

public void EnterAddress1(String address1) {
	driver.findElement(TextBox_Add1).sendKeys(address1);
}

public void EnterAddress2(String address2) {
	driver.findElement(TextBox_Add1).sendKeys(address2);
}

public void SelectCountry(String country) {
	driver.findElement(Dropdown_Country).click();
	Select drpcountry = new Select(driver.findElement(Dropdown_Country));
	drpcountry.selectByVisibleText(country);
	
	
}

public void saveAddress() {
	driver.findElement(SaveAddress).click();
}

public void ValidateAddressisAdded() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20, 1));
    wait.until(ExpectedConditions.visibilityOfElementLocated(AddressDeleteButton));
	driver.findElement(AddressDeleteButton).isDisplayed();
	System.out.println("New Address Has benn added");
}

public void selectNewAddressOption() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20, 1));
    wait.until(ExpectedConditions.visibilityOfElementLocated(CloseSignUpButton));
	driver.findElement(CloseSignUpButton).click();
	driver.findElement(AddressBookLink).click();;
	wait.until(ExpectedConditions.visibilityOfElementLocated(AddAddressButton));
	driver.findElement(AddAddressButton).click();
}

public void selectAddressType() {
	driver.findElement(Radio_DeliveryAdd).click();
}
}

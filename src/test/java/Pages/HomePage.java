package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Verify;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;


public class HomePage {
	public WebDriver driver;
   
	public HomePage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By AcceptCookies = By.xpath("//button[@data-testid='Button-primary']");
	By CreateAccountLink = By.xpath("//button[@data-testid='register']");
	By SignIn_Option = By.xpath("//button[@data-testid='sign-in-button']");
	By Email =By.id("create-account-email");
	By Password =By.id("create-account-password");
	By TermsAConditions = By.xpath("//input[@id='agree-terms']");
	By CreateAccountBttn =By.xpath("//button[@data-testid='Button-primary'][@type='submit']");
	By emailErrorText =By.id("create-account-email-helper-text");
	By PasswordErrorText =By.id("create-account-password-helper-text");
    By TnCErrorText= By.xpath("//p[@class='error-text__RAc9']");
    By MyAccountPreview = By.xpath("//a[@class='my-account__sidebar-title']");

    
    //actions

    public void acceptCookies() {
    	
    	driver.findElement(AcceptCookies).click();
    }
    
    public void select_signInOption() {
    	driver.findElement(SignIn_Option).click();
    }
    
    public void select_createAccount() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20, 1));
    	  wait.until(ExpectedConditions.visibilityOfElementLocated(CreateAccountLink));
    	  driver.findElement(CreateAccountLink).click();
    }
    


	public void enter_email(String inputemail) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20, 1));
   	     wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
    	driver.findElement(Email).sendKeys(inputemail);
    	
    }
    
    public void enter_password(String inputpassword) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20, 1));
   	     wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
    	driver.findElement(Password).sendKeys(inputpassword);
    	
    }
    
    public void TNC() {
    	JavascriptExecutor executor = (JavascriptExecutor)driver;
    	WebElement TNCElement = driver.findElement(TermsAConditions);
    	executor.executeScript("arguments[0].click();", TNCElement);
    }
    
    public void validateBlankFieldMessage() {
    	String BlankEmailFieldeError=driver.findElement(emailErrorText).getText();
    	String BlankPassFieldeError=driver.findElement(PasswordErrorText).getText();
    	String BlankTNCError=driver.findElement(TnCErrorText).getText();
    	Assert.assertEquals(BlankEmailFieldeError, "You need to fill in this field");
    	Assert.assertEquals(BlankPassFieldeError, "You need to fill in this field");
    	Assert.assertEquals(BlankTNCError, "Please confirm you accept the terms and conditions");
    }
    
    public void createAccount() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20, 1));
  	    wait.until(ExpectedConditions.visibilityOfElementLocated(CreateAccountBttn));
    	driver.findElement(CreateAccountBttn).click();
    }
    
    public void validateInvalidEmailError() {
    	String InvalidEmailError=driver.findElement(emailErrorText).getText();
    	Assert.assertEquals(InvalidEmailError, "Sorry, that doesn't look like an email address");
    }
   
   public void  validateInvalidPassError() {
	   String InvalidPassError=driver.findElement(PasswordErrorText).getText();
       Assert.assertEquals(InvalidPassError, "Your password needs to be between 5 and 20 characters long");
   }
   
   public void  validateTNCError() {
	   String BlankTNCError=driver.findElement(TnCErrorText).getText();
	   Assert.assertEquals(BlankTNCError, "Please confirm you accept the terms and conditions");
   }

   public void enterValidEmail(String ValidEmail ) {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20, 1));
 	    wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
	   driver.findElement(Email).sendKeys(ValidEmail);
   }
   
   
   public void enterInValidEmail(String InValidEmail ) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20, 1));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
	   driver.findElement(Email).sendKeys(InValidEmail);
   }
   
   public void enterPass(String inputPassword ) {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20, 1));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
	   driver.findElement(Password).sendKeys(inputPassword);
   }
   
   //Validating after successful registration , user is directed to his account page 
   public void ValidateMyAccountPage() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20, 1));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(MyAccountPreview));
	   String Actual_title=driver.getTitle();
	   Assert.assertEquals(Actual_title, "My Account");
   }
}

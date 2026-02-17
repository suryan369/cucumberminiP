package pagesObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
		 
		public WebDriver driver;
		// Constructor
		 
				public LoginPage (WebDriver driver) {
				this.driver = driver;
				}
		 
		//By Locators
		 
	    /*public By emailInputLocator = By.name("email"); 
		public By passwordInputLocator = By.name("password");
		public By loginButtonLocator = By.xpath("//input[@type='submit']");
		public By forgottenPasswordLinkLocator = By.linkText("Forgotten Password");
		public By logoutLinkLocator = By.linkText("Logout");
		*/ 
		
		@FindBy(name="email")
		@CacheLookup
		WebElement emailInput;
		
		@FindBy(name="password")
		@CacheLookup
		WebElement passwordInput;
		
		@FindBy(xpath="//input[@type='submit']")
		@CacheLookup
		WebElement loginButton;
		
		@FindBy(linkText="Forgotten Password")
		@CacheLookup
		WebElement forgottenPasswordLink;
		
		@FindBy(linkText="Logout")
		@CacheLookup
		WebElement logoutBt;
		
		
		// Page Methods/Actions
		 
		public void enterEmail (String email) {
		emailInput.clear();
		emailInput.sendKeys(email);
		}
		 
		public void enterPassword (String password) {
		passwordInput.clear();
		passwordInput.sendKeys(password);
		}
		
		public void clickLoginButton() {
		loginButton.click();
		}
	    
		public void clickForgottenPasswordLink() {
		forgottenPasswordLink.click();
		}
		public boolean checkForgotPwdLink(){
		return forgottenPasswordLink.isDisplayed();
		}
		
		public boolean checkLogoutLink(){
		return logoutBt.isDisplayed();
		}
		 
		public void login(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLoginButton();
		}
		 
		public String getForgotPwdPageUrl(){
		String forgotPwdPageUrl = driver.getCurrentUrl();
		return forgotPwdPageUrl;
		}
		
}

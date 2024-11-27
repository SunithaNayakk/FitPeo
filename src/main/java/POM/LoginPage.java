package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
       public  LoginPage(WebDriver driver)
       { 
    	   PageFactory.initElements(driver,this);
       }
       
		@FindBy(id="username")
		private WebElement userTextField;
		
		public WebElement getUserTextField() {
			return userTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		@FindBy(name="pwd")
		private WebElement passwordTextField;
		 
		@FindBy(id="loginButton")
		private WebElement loginButton;
		
		public void loginToApp(String username,String password)
		{
			userTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			loginButton.click();
			
		}
			
}

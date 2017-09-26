package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
	
	String URL = "http:\\www.mail.ru";
	By login = By.name("Login");
	By password = By.name("Password");
	By loginButton = By.id("mailbox__auth__button");

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	
	public void open()
	{
		getDriver().get(URL);
	}
	
	public void typeUserLogin(String UsreLogin){
		driver.findElement(login).sendKeys(UsreLogin);
	}
	
	public void typeUserPassword(String UsrePaasword){
		driver.findElement(password).sendKeys(UsrePaasword);
		
	}
	
	public void clickOnLoginButton(){
		driver.findElement(loginButton).click();
	}
	
}
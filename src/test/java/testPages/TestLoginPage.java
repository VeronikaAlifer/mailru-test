
package testPages;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MailPage;

public class TestLoginPage {
	private WebDriver driver;

	@BeforeMethod
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User-PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testLoginPage() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.open();
		loginPage.typeUserLogin("1109540");
		loginPage.typeUserPassword("isohad90");
		loginPage.clickOnLoginButton();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element5 = driver.findElement(By.id("PH_logoutLink"));
		assertTrue(element5.isDisplayed());
		MailPage mailPage = new MailPage(driver);
		mailPage.clickOnWriteLetterBotton();
		mailPage.typeAdress();
		mailPage.typeTopicText();
		mailPage.typeLetter();
		mailPage.clickOnSendButtonList();
	}
	
	
	
	@AfterMethod
	public void destroyBrowser()
	{
		driver.quit();
	}

}

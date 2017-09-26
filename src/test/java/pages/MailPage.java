package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailPage extends Page{
	
	By writeLetterBotton =By.className("b-toolbar__item");
	By whom = By.cssSelector("textarea.js-input.compose__labels__input");
	By topicText = By.cssSelector("div.compose-head__field input.b-input");
	By mailText = By.cssSelector("textarea.bsbb.composeEditor");
	

	public MailPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void clickOnWriteLetterBotton(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(writeLetterBotton).click();
	}
	
	
	public void typeAdress(){
		driver.findElement(whom).sendKeys("1109540@mail.ru");
		
	}	
	
	public void typeTopicText(){
		driver.findElement(topicText).sendKeys("Test Topic");
	}
	
	public void typeLetter(){
		WebElement removeEmphasizeElement = driver.findElement(By.cssSelector("a.mceToolbarLink.mceToolbarLinkEnabled.mce_enableTextEditor"));
		removeEmphasizeElement.click();
		driver.findElement(mailText).click();
		driver.findElement(mailText).clear();
		driver.findElement(mailText).sendKeys("Hello everyone!");
				
	}
	
	public void clickOnSendButtonList(){
		List<WebElement> sendButtonList = driver.findElements(By.cssSelector("div#b-toolbar__right div.b-toolbar__btn.b-toolbar__btn_"));
		WebElement sendButton = sendButtonList.get(1);
		sendButton.click();
		
	}
	
	

}
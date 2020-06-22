package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.chatbotpage;



public class PageObjectManager {
	private WebDriver driver;
	private chatbotpage botpage;
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public chatbotpage getchatbotPage()
	{
		return (botpage == null) ? botpage = new chatbotpage(driver) : botpage;
	}
	
}

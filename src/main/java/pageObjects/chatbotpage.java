package pageObjects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class chatbotpage {
	WebDriver driver;
	WebDriverWait wait;
	public chatbotpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	@FindBy(xpath = "//span[text()='Go to advisor']")
	WebElement advisorbutton;
	@FindBy(xpath = "//p[text()='Hello, I am your Sonicare Brush Head Advisor Bot']")
	WebElement Sonicaretext;
	
	public void navigateTo_usaPhilips() throws InterruptedException 
	{
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public void clickOnGoToadvisorbutton() throws Exception {
		if (advisorbutton.isDisplayed()) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",advisorbutton);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].style.border='3px solid red'",advisorbutton);
			advisorbutton.click();
		} else {
			throw new Exception("Field not found");
		}
	}
	public void sonicaretext(String text) throws Exception {
		if (Sonicaretext.isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					Sonicaretext);
			String text1 = Sonicaretext.getText();
			assertEquals(text1, text);
			System.out.println(text1);
		}
	}
}

package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.cucumber.listener.Reporter;

import junit.framework.Assert;
import managers.FileReaderManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

 
public class DecisionPage {
	

	public DecisionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	WebDriver driver;

	@FindBy(xpath = "//div[@class='slds-context-bar__label-action slds-p-left--none']/../../a/span[text()='Decisions']")
	WebElement decisions;
	@FindBy(xpath = "//button[@title='New Decision' and text()='New']")
	WebElement newbutton;
	@FindBy(xpath = "(//div[@class='slds-page-header ft-winter-desktop-header']/div/div[3]/div/button[@title='New Decision'])[2]")
	WebElement newbutton1;
	@FindBy(xpath = "//div[@class='slds-form-element']/div/div/select[@class='select uiInput uiInputSelect uiInput--default uiInput--select']")
	WebElement recorddropdown;
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement continuebutton;
	@FindBy(xpath = "//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input']")
	WebElement texttitle;
	@FindBy(xpath = "//textarea[@class='slds-textarea textarea uiInput uiInputTextArea uiInput--default uiInput--textarea']")
	WebElement descriptiondecision;
	@FindBy(xpath = "//a[@class='datePicker-openIcon display']")
	WebElement datepicker;
	@FindBy(xpath = "//select[@class='slds-select picklist__label']")
	WebElement dateyear;
	@FindBy(xpath = "//div[@class='visible DESKTOP uiDatePicker--default uiDatePicker']")
	WebElement cale;
	@FindBy(xpath = "//h2[@class='monthYear']")
	List<WebElement> datemonth;
	@FindBy(xpath = "//div[@class='datepicker__filter--month slds-grid slds-grid_align-spread slds-grow']/div[@class='nextLinks slds-align-middle']")
	WebElement monthch;
	@FindBy(xpath = "//div[@class='site-content slds-p-around--medium qcd_wrapper']/div[2]/select[@class='select uiInput uiInputSelect uiInput--default uiInput--select']")
	WebElement prioritydrop;
	@FindBy(xpath = "//div[@class='scrollable uiScrollerWrapper']")
	WebElement scrollview;
	@FindBy(xpath = "//button[@class='slds-button slds-button--neutral slds-button slds-button--neutral slds-button--brand uiButton']")
	WebElement sharebutton;
	@FindBy(xpath = "//div[@class='slds-align-middle decision-title-no-truncate']")
	WebElement decisiontext;
	@FindBy(xpath = "//div[@class='scroller slds-datepicker']")
	WebElement dateverify;
	@FindBy(xpath = "//tr[@class='calRow']")
	List<WebElement> rowtr;
	@FindBy(xpath = "//div[@class='scroller slds-datepicker']/div[2]/table/tbody/tr/td[@class='uiDayInMonthCell']")
	List<WebElement> coltd;
	@FindBy(xpath = "//div[@class='scroller slds-datepicker']/div[2]/table/tbody/tr[7]/td/button[text()='Today']")
	WebElement todaydate;
	@FindBy(xpath = "//div[@class='scrollable uiScrollerWrapper']/div/div/div/div[3]/div/label[text()='Taxonomy']")
	WebElement taxn;
	@FindBy(xpath = "//span[@class='toastMessage slds-text-heading--small forceActionsText']")
	WebElement errormessage;
	@FindBy(xpath = "//div[@class='input-has-icon input-has-icon--right']")
	WebElement time;
	@FindBy(xpath = "//ul[@class='datepicker--time__list']/li")
	List<WebElement> timedrop;
	@FindBy(xpath = "(//span[@class='tooltip'])[2]")
	WebElement datevalidationdecis;
	@FindBy(xpath = "//*[@class='title-decisin slds-icon slds-icon--small ft-icon-decision']")
	WebElement deciimage;
	@FindBy(xpath = "//a[text()='Classification']")
	WebElement classfication;
	// @FindBy(xpath="(//div[@class='ft-press-topic']/label/../div[@class='slds-form-element__control
	// slds-m-bottom--small'])[1]")
	// WebElement pritext;
//	(//select[@class=' select uiInput uiInputSelect uiInput--default uiInput--select'])[1]
	@FindBy(xpath = "(//select[@class=' select uiInput uiInputSelect uiInput--default uiInput--select'])[1]")
	WebElement pritext;
	@FindBy(xpath = "//span[@class='tooltip']")
	WebElement datetextvalida;
	@FindBy(xpath = "//span[@class='tooltip ft-info']")
	WebElement datetoday;
	@FindBy(xpath = "//a[@id='collaborateTab__item']")
	WebElement chatter;
	@FindBy(xpath = "//button[@title='Share an update...']")
	WebElement shareanupdate;
	@FindBy(xpath = "//div[@data-placeholder='Share an update...']")
	WebElement entertextshare;
	@FindBy(xpath = "//button[@title='Share']")
	WebElement shareBut;
	@FindBy(xpath = "//div[@class='slds-card-wrapper forceChatterFeedInner cuf-wide-feed']/div[2]/div/div[2]/div//div/article/div[2]/div/div[@class='feedBodyInner Desktop oneApp']")
	List<WebElement> textpost;
	@FindBy(xpath = "//label[text()='Backup for Accountable']/../../div/div/div/div/span/button[@class='slds-button slds-button--icon-border-filled slds-button--icon-small ft-ie-plus-icon']")
	WebElement backupForAcc;
	@FindBy(xpath = "//label[text()='Backup for Accountable']/../../div/div/div/div/div/input[@placeholder='User name...']")
	WebElement entertextbackup;
	@FindBy(xpath = "//label[text()='Backup for Accountable']/../../div/div/div/div/div[2]/ul/li[@class='slds-lookup__item cUI_LookupItem']")
	List<WebElement> backuplist;
	@FindBy(xpath = "//label[text()='Responsible']/../../div/div/div/div/span/span/span[2]")
	WebElement backuptext;
	@FindBy(xpath = "//label[text()='Consulted']/../div/div/div/span/button[@class='slds-button slds-button--icon-border-filled slds-button--icon-small ft-ie-plus-icon']")
	WebElement consultedButton;
	@FindBy(xpath = "//label[text()='Consulted']/../../div/div/div/div/div/input[@class='slds-input']")
	WebElement consultedText;
	@FindBy(xpath = "//label[text()='Consulted']/../../div/div/div/div/div[2]/ul[@class='slds-listbox ft-search-dropdown slds-listbox_vertical slds-dropdown slds-dropdown_fluid']")
	List<WebElement> consultedList;
	@FindBy(xpath = "//label[text()='Informed']/../div/div/div/span/button[@class='slds-button slds-button--icon-border-filled slds-button--icon-small ft-ie-plus-icon']")
	WebElement InformedButton;
	@FindBy(xpath = "//label[text()='Informed']/../../div/div/div/div/div/input[@class='slds-input']")
	WebElement InformedText;
	@FindBy(xpath = "//label[text()='Informed']/../../div/div/div/div/div[2]/ul[@class='slds-listbox ft-search-dropdown slds-listbox_vertical slds-dropdown slds-dropdown_fluid']")
	List<WebElement> InformedList;

	public void clickOnDecision() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
				decisions);
		Actions hover = new Actions(driver);
		hover.moveToElement(decisions).click().build().perform();
		// Thread.sleep(75000);
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", decisions);
		 */
	}

	public void clickOnNewButton() throws Exception {
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,20); WebElement
		 * ele=wait.until(ExpectedConditions.visibilityOf(newbutton));
		 * if(ele.isDisplayed()) { System.out.println("New Button is displayed"); }
		 */

		try {
			if (newbutton.isDisplayed()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", newbutton);
				Reporter.addStepLog("Stepcheck");
			} else if (newbutton1.isDisplayed()) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", newbutton1);
			}
		} catch (Exception e) {
			System.out.println("exception is found" + e);
		}
	}

	public void dropDown(String dropdownvalue) throws Exception {
		if (recorddropdown.isDisplayed()) {
			Select drpdecision = new Select(recorddropdown);
			drpdecision.selectByVisibleText(dropdownvalue);
		} else {
			throw new Exception("dropdown value not found");
		}
	}

	public void continuebutton() throws Exception {
		if (continuebutton.isDisplayed()) {
			continuebutton.click();
		} else {
			throw new Exception("button not found");
		}
	}

	public void enterTextTitle(String title) throws Exception {
		if (texttitle.isDisplayed()) {
			texttitle.clear();
			texttitle.click();
			texttitle.sendKeys(title);
		} else {
			throw new Exception("text is not found");
		}
	}

	public void enterDescriptionText(String description) throws Exception {
		if (descriptiondecision.isDisplayed()) {
			descriptiondecision.clear();
			descriptiondecision.click();
			descriptiondecision.sendKeys(description);
		} else {
			throw new Exception("Description field is not found");
		}
	}

	public void priorityDropDown(String priority) throws Exception {

		if (prioritydrop.isDisplayed()) {
			/*
			 * ((JavascriptExecutor)
			 * driver).executeScript("arguments[0].scrollIntoView(true);",scrollview);
			 * Thread.sleep(2000);
			 */
			Actions ac = new Actions(driver);
			ac.moveToElement(prioritydrop);
			ac.perform();
			// Thread.sleep(4000);
			Select drp = new Select(prioritydrop);
			drp.selectByVisibleText(priority);
		} else {
			throw new Exception("priority drop down is not found");
		}
	}

	public void clickOnShareButton() throws Exception {
		if (sharebutton.isDisplayed()) {
			sharebutton.click();
		} else {
			throw new Exception("Share button not found");
		}
	}

	public void datePicker(String datepick) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", taxn);
		Thread.sleep(3000);
		datepicker.click();
		String datetext = todaydate.getText();
		System.out.println(datetext);
		if (datetext.equalsIgnoreCase(datepick)) {
			todaydate.click();
		} else {
			String date, month, year;
			String dateArray[] = datepick.split("/");
			date = dateArray[0];
			System.out.println(date);
			month = dateArray[1];
			System.out.println(month);
			year = dateArray[2];
			System.out.println(year);
			for (WebElement month1 : datemonth) {
				System.out.println(month1);

				while (!month1.getText().equalsIgnoreCase(month)) {
					System.out.println(month1);
					System.out.println(month);
					Actions act = new Actions(driver);
					act.moveToElement(monthch);
					monthch.click();
				}
			}
			if (dateyear.getText().equals(year)) {
				System.out.println("same date");
			}

			else {
				Select drpyear = new Select(dateyear);
				drpyear.selectByVisibleText(year);
			}

			System.out.println(date);

			// Thread.sleep(2000);
			for (WebElement cell : coltd) {
				System.out.println(cell.getText());
				if (cell.getText().equals(date)) {
					cell.click();
					break;
				}
				/*
				 * else { throw new Exception("entered date is incorrect"); }
				 */
			}
		}
	}

	public void textvalidate(String errmessage) throws Exception {
		String text = errormessage.getText();
		System.out.println(text);
		System.out.println(errmessage);
		Thread.sleep(2000);
		if (text.equalsIgnoreCase(errmessage)) {
			/*
			 * JavascriptExecutor js=(JavascriptExecutor) driver; js.
			 * executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');"
			 * , errmessage); Thread.sleep(3000);
			 */
			System.out.println("Correct error message is dispayed");
		} else {
			throw new Exception("In correct message displayed");
		}

	}

	public void setTime(String tim) throws Exception {
		// Thread.sleep(2000);
		time.click();
		// Thread.sleep(2000);
		for (WebElement time1 : timedrop) {
			String text = time1.getText();
			if (text.equalsIgnoreCase(tim)) {
				time1.click();
				break;
			}

		}

		/*
		 * for(WebElement time1:timedrop) { System.out.println(timedrop);
		 * System.out.println(time1); if(time1.getText().equalsIgnoreCase(tim)) {
		 * time1.click(); break; } }
		 */

	}

	public void decisionText(String text1) throws Exception {
		// Thread.sleep(50000);
		if (decisiontext.isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					decisiontext);
			Thread.sleep(2000);
			String text2 = decisiontext.getText();
			assertEquals(text1, text2);
			// text2.equals(text1);
		} else {
			throw new Exception("Text not valid");
		}
	}

	public void decisionDate(String text) throws Exception {
		if (datevalidationdecis.isDisplayed()) {
			String text1 = datevalidationdecis.getText();
			System.out.println(text1);

			String datearray[] = text1.split("(");
			String date = datearray[0];
			System.out.println(date);
			assertEquals(text1, text);
		}

	}

	public void classification() throws Exception {
		if (classfication.isDisplayed()) {
			classfication.click();
		}
	}

	public void priorityvalidation(String text1) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pritext);
		if (pritext.isDisplayed()) {
			/*
			 * Select sel=new Select(pritext); WebElement option =
			 * sel.getFirstSelectedOption();
			 */
			Select sel = new Select(pritext);
			String text2 = sel.getFirstSelectedOption().getText();
			System.out.println(text2);
			assertEquals(text1, text2);
			System.out.println("text is correct");
		} else {
			throw new Exception("incorrect text");
		}
	}

	public void datetextvalidation(String text) throws Exception {
		if (datetextvalida.isDisplayed()) {
			String text1 = datetextvalida.getText();
			String text2 = StringUtils.substringBetween(text1, "(", ")");
			String text3 = text2.replaceAll("\\s+$", "");
			System.out.println(text2);
			assertEquals(text3, text);
		} else {
			throw new Exception("Incorrect date");
		}
	}

	public void todaydate() throws Exception {
		DateFormat format = new SimpleDateFormat("M/d/yyyy");
		System.out.println(format.format(new Date()));
		String text = format.format(new Date());
		String text1 = datetoday.getText();
		String text2 = StringUtils.substringBetween(text1, "(", ")");
		String text3 = text2.replaceAll("\\s+$", "");
		assertEquals(text3, text);

	}

	public void clickOnChatter() throws Exception {
		if (chatter.isDisplayed()) {
			chatter.click();
		} else {
			throw new Exception("Field not found");
		}
	}

	public void clickOnShareAnUpdate() throws Exception {
		if (shareBut.isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", shareBut);
			// shareButton.click();

		} else {
			throw new Exception("Field not found");
		}
	}

	public void clickPostEnterText(String text) throws Exception {
		if (entertextshare.isDisplayed()) {

			/*
			 * JavascriptExecutor js=(JavascriptExecutor) driver;
			 * js.executeScript("arguments[0].value='"+ text +"';",entertextshare);
			 */
			entertextshare.sendKeys(text);

		} else {
			throw new Exception("Field not found");
		}
	}

	public void shareButton() throws Exception {
		if (shareBut.isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", shareBut);
		} else {
			throw new Exception("shareButton not found");
		}
	}

	public void textInChatterValidation(String text) throws Exception {
		for (WebElement text1 : textpost) {
			if (text1.getText().equals(text)) {
				System.out.println(text1);
			} else {
				throw new Exception("wrong text");
			}
		}
	}

	public void clickOnBackUp() throws Exception {
		if (backupForAcc.isDisplayed()) {
			backupForAcc.click();
		} else {
			throw new Exception("Element not clickable");
		}
	}

	public void enterTextInBackUp(String text) throws Exception {
		
		if(entertextbackup.isDisplayed())
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",entertextbackup);
			entertextbackup.sendKeys(text);
			Thread.sleep(2000);
			try
			{
			for(WebElement ele:backuplist)
			{
				System.out.println(ele.getText());
				if(ele.getText().equals(text))
				{
						/*
						 * System.out.println(ele.getText()); ele.click(); break;
						 */
					   boolean staleElement = true; 
						while(staleElement){    	
							  Actions action = new Actions(driver);
							  action.moveToElement(ele).doubleClick().perform(); new WebDriverWait(driver,
							 10) .ignoring(StaleElementReferenceException.class); 
							  staleElement=false; 
					    }
			
				}}
			}
			
			 catch(StaleElementReferenceException e) {
				 for(WebElement ele:backuplist)
					{
						System.out.println(ele.getText());
						if(ele.getText().equals(text))
						{
						ele.click();
						}
					}
						
			     }
		}
					    /*int attempts = 0;
					    while(attempts < 2) {
					        
					        	ele.click();
							
							 * Actions action = new Actions(driver);
							 * action.moveToElement(ele).doubleClick().perform(); new WebDriverWait(driver,
							 * 10) .ignoring(StaleElementReferenceException.class); result = true; break;
							 */
					            
					        
						/* attempts++; */
					    }
					  
					/*boolean staleElement = true; 
					while(staleElement){
					  try{*/
							/*
							 * WebDriverWait wait = new WebDriverWait(driver, 10);
							 * wait.until(ExpectedConditions.stalenessOf(ele));
							 */
					
					/*
					 * ele.click(); staleElement = false;
					 * 
					 * } catch(StaleElementReferenceException e){
					 * System.out.println(e.getMessage()); } }
					 */
				
	/*
	 * } } }else
	 * 
	 * { throw new Exception("text not able to enter"); }
	 */
	

	public void resptext(String text) throws Exception {
		if (backuptext.isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					backuptext);
			String text1 = backuptext.getText();
			assertEquals(text1, text);
			System.out.println(text1);
		}
	}

	public void clickOnConsultedButton() throws Exception {
		if (consultedButton.isDisplayed()) {
			consultedButton.click();
		} else {
			throw new Exception("consultedButton is not displayed");
		}
	}

	public void clickOnConsultedEnterText(String text) throws Exception {
		if (consultedText.isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", consultedText);
			consultedText.sendKeys(text);
			Thread.sleep(3000);
			try
			{
			for (WebElement ele : consultedList) {
				System.out.println(ele.getText());
				if (ele.getText().equals(text)) {
					 boolean staleElement = true; 
						while(staleElement){    	
							  Actions action = new Actions(driver);
							  action.moveToElement(ele).doubleClick().perform(); new WebDriverWait(driver,
							 10) .ignoring(StaleElementReferenceException.class); 
							  staleElement=false; 
							  
							  
					    }
				}
			}
			}
			 catch(StaleElementReferenceException e) {
				 for(WebElement ele:consultedList)
					{
						System.out.println(ele.getText());
						if(ele.getText().equals(text))
						{
						ele.click();
						Thread.sleep(4000);
						}
					}
						
			 }
		}
	}
	

	public void clickOnInformedButton() throws Exception {
		if (InformedButton.isDisplayed()) {
			InformedButton.click();
		} else {
			throw new Exception("InformedButton is not displayed");
		}
	}

	public void enterTextInInformedText(String text) throws Exception {
		if (InformedText.isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", InformedText);
			InformedText.sendKeys(text);
			Thread.sleep(3000);
			try
			{
			for (WebElement ele : InformedList) {
				System.out.println(ele.getText());
				if (ele.getText().equals(text)) {
					 boolean staleElement = true; 
						while(staleElement){    	
							  Actions action = new Actions(driver);
							  action.moveToElement(ele).doubleClick().perform(); new WebDriverWait(driver,
							 10) .ignoring(StaleElementReferenceException.class); 
							  staleElement=false; 
						}
				}
			}
		}
			 catch(StaleElementReferenceException e) {
				 for(WebElement ele:InformedList)
					{
						System.out.println(ele.getText());
						if(ele.getText().equals(text))
						{
						ele.click();
						Thread.sleep(4000);
						}
					}
						
		        }
		}

	/*
	 * public void image() throws Exception {
	 * 
	 * Screen screen=new Screen(); Pattern decimage=new Pattern(
	 * "C:\\Users\\Hari\\EclipseFiles\\FingerTipBddFramewrk\\images\\plan_image.PNG"
	 * ); screen.exists(decimage); System.out.println("image is present");
	 * 
	 * 
	 * BufferedImage expectImage = ImageIO.read(new
	 * File(System.getProperty("user.dir") +"/images/decision_image.PNG"));
	 * Screenshot ImageScreenshot = new AShot().coordsProvider(new
	 * WebDriverCoordsProvider()).takeScreenshot(driver,deciimage); BufferedImage
	 * actualImage = ImageScreenshot.getImage(); ImageDiffer imgDiff = new
	 * ImageDiffer(); ImageDiff diff = imgDiff.makeDiff(actualImage,
	 * expectImage).withDiffSizeTrigger(50);
	 * assertFalse(diff.hasDiff(),"Result of Image comparsion");
	 * System.out.println("Images Compared Sucesfully");
	 * 
	 * 
	 * BufferedImage expectImage = ImageIO .read(new
	 * File(System.getProperty("user.dir") + "/images/decision_image.PNG"));
	 * Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver,
	 * deciimage); BufferedImage actualImage = logoImageScreenshot.getImage();
	 * 
	 * ImageDiffer imgDiff = new ImageDiffer(); ImageDiff diff =
	 * imgDiff.makeDiff(actualImage, expectImage); if (diff.hasDiff() == true) {
	 * System.out.println("Images are Not Same"); } else {
	 * System.out.println("Images are Same"); }
	 * 
	 * 
	 * Screenshot shot = new AShot().takeScreenshot(driver, deciimage); File file =
	 * new File(System.getProperty("user.dir")+"/images/decision_image.PNG");
	 * System.out.println(file); ImageIO.write(shot.getImage(), "PNG", file);
	 * 
	 * 
	 * //Getting Expected Image BufferedImage expectedImg = ImageIO.read(file);
	 * 
	 * //Getting Actual Image BufferedImage actualImg = shot.getImage();
	 * 
	 * //Image Comparison ImageDiffer imgDiff = new ImageDiffer(); ImageDiff dif =
	 * imgDiff.makeDiff(expectedImg, actualImg); if(dif.hasDiff()){
	 * System.out.println("Both images are different"); }else {
	 * System.out.println("Both images are same"); }
	 * 
	 * }
	 */
	}
}

package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumberContext.TestContext;
import pageObjects.chatbotpage;

public class chatbotstepdefinition {
		TestContext testContext;
		chatbotpage botpage;

		public chatbotstepdefinition(TestContext context) {
			testContext = context;
			botpage = testContext.getPageObjectManager().getchatbotPage();
		}
		@Given("^user launches Url of usaphilips$")
		public void user_launches_Url_of_usaphilips() throws Throwable {
			botpage.navigateTo_usaPhilips();
		}
		@Given("^user click on Go to advisor button$")
		public void user_click_on_Go_to_advisor_button() throws Throwable {
			botpage.clickOnGoToadvisorbutton();
		}
		@Given("^validate text \"([^\"]*)\"$")
		public void validate_text(String test1) throws Throwable {
			botpage.sonicaretext(test1);
		}

	}


package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumberContext.TestContext;
import pageObjects.DecisionPage;

public class DecisionsSmokeStepDef {
	TestContext testContext;
	DecisionPage decisionpage;
	public DecisionsSmokeStepDef(TestContext context) {
		testContext = context;
		decisionpage = testContext.getPageObjectManager().getdecisionPage();
	}
    
	@Then("^Click on Decision Tab$")
	public void click_on_Decision_Tab() throws Throwable {
		decisionpage.clickOnDecision();
	}
	@Then("^Click on New button$")
	public void click_on_New_button() throws Throwable {
	decisionpage.clickOnNewButton();
	}

	/*
	 * @Then("^I validate decision image$") public void I_validate_decision_image()
	 * throws Throwable { decisionpage.image(); }
	 */
	@Then("^User select \"([^\"]*)\" frm the dropdown$")
	public void user_select_frm_the_dropdown(String dropdownvalue) throws Throwable {
	  decisionpage.dropDown(dropdownvalue);
	}
	@Then("^click on continue button$")
	public void click_on_continue_button() throws Throwable {
		decisionpage.continuebutton();
	}
	@Then("^user enters \"([^\"]*)\" in NewDecision page$")
	public void user_enters_in_NewDecision_page(String title) throws Throwable {
		decisionpage.enterTextTitle(title);
	}
	@Then("^user enters \"([^\"]*)\" in decision page$")
	public void user_enters_in_decision_page(String description) throws Throwable {
	    decisionpage.enterDescriptionText(description);
	}
	
	  @Then("^user selects \"([^\"]*)\" in date picker$")
	  public void user_selects_in_date_picker(String datepick) throws Throwable {
	  decisionpage.datePicker(datepick); 
	  }
	  @Then("^user validate \"([^\"]*)\" error message$")
	  public void text_error_message(String errmessage) throws Throwable {
		  decisionpage.textvalidate(errmessage);
	  }
	 
	 
	@Then("^user selects \"([^\"]*)\" as priority$")
	public void user_selects_as_priority(String priority) throws Throwable {
		decisionpage.priorityDropDown(priority);
	}
	@Then("^I click on share button$")
	public void i_click_on_share_button() throws Throwable {
		decisionpage.clickOnShareButton();
	}
	@Then("^I vaidate text \"([^\"]*)\" in Decision page$")
	public void i_vaidate_text_in_Decision_page(String text) throws Throwable {
		decisionpage.decisionText(text);
	}
    @And("^user selects \"([^\"]*)\" in time section$")
    public void time_in_decision_page(String tim) throws Throwable {
    	decisionpage.setTime(tim);
    }
    @Then("^I validate time \"([^\"]*)\" in decision$")
    public void i_validate_time_in_decision(String text) throws Throwable {
        decisionpage.decisionDate(text);
    }
    @Then("^Click on Classification tab$")
    public void click_on_Classification_tab() throws Throwable {
    	decisionpage.classification();
    }

    @Then("^user validate priority \"([^\"]*)\" under Classification$")
    public void user_validate_priority_under_Classification(String text1) throws Throwable {
    	decisionpage.priorityvalidation(text1);
    }
    @Then("^I validate text \"([^\"]*)\"$")
    public void i_validate_text(String text1) throws Throwable {
    	decisionpage.datetextvalidation(text1);
    }
    @Then("^I Validate today date in decision page$")
    public void i_Validate_today_date_in_decision_page() throws Throwable {
    	decisionpage.todaydate();
    }
    @Then("^Click on Chatter tab$")
    public void click_on_Chatter_tab() throws Throwable {
    	decisionpage.clickOnChatter();  
    }
    @Then("^Click on Text box of Post$")
    public void click_on_Text_box_of_Post() throws Throwable {
    	decisionpage.clickOnShareAnUpdate();
    }

    @Then("^ENter the \"([^\"]*)\"  in box$")
    public void enter_the_in_box(String text) throws Throwable {
    	decisionpage.clickPostEnterText(text);
    }

    @Then("^CLick on Share button$")
    public void click_on_Share_button() throws Throwable {
    	decisionpage.clickOnShareAnUpdate();
    }
    @Then("^validate \"([^\"]*)\" text in chatter tab$")
    public void validate_text_in_chatter_tab(String text) throws Throwable {
    	decisionpage.textInChatterValidation(text);
    }
    @Then("^I click on backup for accoutable link$")
    public void i_click_on_backup_for_accoutable_link() throws Throwable {
    	decisionpage.clickOnBackUp();
    }

    @Then("^Enter \"([^\"]*)\" in backup for accoutable link$")
    public void enter_in_backup_for_accoutable_link(String text) throws Throwable {
    	decisionpage.enterTextInBackUp(text);
    }
    @Then("^user validate \"([^\"]*)\" in responsible field$")
    public void user_validate_in_responsible_field(String text) throws Throwable {
    	decisionpage.resptext(text);
    }
    @Then("^I click on Consulted button$")
    public void i_click_on_Consulted_button() throws Throwable {
    	decisionpage.clickOnConsultedButton();
    }

    @Then("^Enter \"([^\"]*)\" in Consulted link$")
    public void enter_in_Consulted_link(String text) throws Throwable {
    	decisionpage.clickOnConsultedEnterText(text);
    }

	/*
	 * @Then("^user validate \"([^\"]*)\" in Consulted field$") public void
	 * user_validate_in_Consulted_field(String arg1) throws Throwable {
	 * 
	 * }
	 */
    @Then("^I click on Informed button$")
    public void i_click_on_Informed_button() throws Throwable {
    	decisionpage.clickOnInformedButton();
    }

    @Then("^Enter \"([^\"]*)\" in Informed link$")
    public void enter_in_Informed_link(String text) throws Throwable {
    	decisionpage.enterTextInInformedText(text);
    }

	/*
	 * @Then("^user validate \"([^\"]*)\" in Informed field$") public void
	 * user_validate_in_Informed_field(String arg1) throws Throwable {
	 * 
	 * }
	 */


   }

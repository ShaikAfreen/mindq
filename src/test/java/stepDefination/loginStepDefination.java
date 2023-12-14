package stepDefination;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import allPages.LoginPPP;
import genericMethods.GenericMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefination extends LoginPPP {

	@Given("User is on login page")
	public void user_is_on_login_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		BrowseLaunch();
		ExtentCucumberAdapter.addTestStepLog("Browser is launched");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethods.takeScreen());
	}

	@When("^user enters right username \"([^\"]*)\"$")
	public void user_enters_right_username(String username) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		Enter_Email(username);
		ExtentCucumberAdapter.addTestStepLog("user entered username successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethods.takeScreen());
	}

	@And("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String password) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		Enter_Password(password);
		ExtentCucumberAdapter.addTestStepLog("user entered password successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethods.takeScreen());
	}

	@And("click on submit")
	public void click_on_submit() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		LoginIn();
		ExtentCucumberAdapter.addTestStepLog("user clicked password");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethods.takeScreen());
	}

	@Then("Browser close")
	public void user_should_be_on_home_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		ExtentCucumberAdapter.addTestStepLog("user is in homepage");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethods.takeScreen());
		driver.close();
	}

	
}

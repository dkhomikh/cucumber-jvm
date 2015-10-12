package adm1;

import java.io.IOException;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {

	@Given("^cucumber installed$")
	public void cucumber_installed() throws Throwable {
		System.out.println("Cucumber installed");
		// throw new PendingException();
	}

	@When("^all dependencies added to pom\\.xml$")
	public void all_dependencies_added_to_pom_xml() throws Throwable {
		System.out.println("all dependencies added to pom.xml");
		// throw new PendingException();
	}

	@When("^maven project created$")
	public void maven_project_created() throws Throwable {
		System.out.println("maven project created");
		// throw new PendingException();
	}

	@Then("^user can run cucumber test$")
	public void user_can_run_cucumber_test() throws Throwable {
		System.out.println("user can run cucumber tests");
		// throw new PendingException();
	}

	@Given("^web driver initialized as \"([^\"]*)\"$")
	public void web_driver_initialized_as(String browser) throws Throwable {
		Drivers.DriverInit(browser);
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^user navigates to website \"([^\"]*)\"$")
	public void user_navigates_to_website(String urlName) throws Throwable {
		Drivers.GoTo(urlName);
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

//	@Then("^user quits browser$")
//	public void user_quits_browser() {
//		Drivers.BrowserQuit();
//
//	}

	@After
	public void qb() {
		Drivers.BrowserQuit();
	}

}

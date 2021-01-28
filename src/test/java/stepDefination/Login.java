package stepDefination;

import org.junit.runner.RunWith;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

@RunWith(Cucumber.class)
public class Login {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	
    	System.out.println("Loaded Home Page");
        
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	
    	System.out.println("Logged in Successfully");
        
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	
    	System.out.println("Validated Home Page");
        
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	
    	System.out.println("Cards details displayed");
        
    }

}
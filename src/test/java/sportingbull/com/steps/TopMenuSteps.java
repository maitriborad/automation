package sportingbull.com.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.asserts.SoftAssert;
import sportingbull.com.pages.HomePage;
import sportingbull.com.pages.LoginPage;

import java.util.List;

public class TopMenuSteps {
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }
    @When("^I accept cookies$")
    public void iAcceptCookies() {
        new HomePage().clickOnAcceptCookies();
    }
    @Then("^User can see all option on TopMenuBar$")
    public void userCanSeeAllOptionOnTopMenuBar(DataTable dataTable) {
        List<String> options = dataTable.asList(String.class);
        SoftAssert softAssert=new SoftAssert();
        for(int i = 1; i <= options.size()-1; i++){
            softAssert.assertTrue(new HomePage().isOptionsInTopMenu(options.get(i)),"'"+options.get(i)+"'not found");
        }
        softAssert.assertAll();
    }

    @And("^User click on login button$")
    public void userClickOnLoginButton() {
        new HomePage().clickOnLogin();
    }

    @When("^User enter username \"([^\"]*)\"$")
    public void userEnterUsername(String username) {
        new LoginPage().enterUsername(username);
    }

    @And("^User enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^User click on login tab$")
    public void userClickOnLoginTab() {
        new LoginPage().clickOnLoginTab();
    }

    @Then("^User login not success with message \"([^\"]*)\"$")
    public void userLoginNotSuccessWithMessage(String message) {
        new LoginPage().verifyMessage(message);
    }
}

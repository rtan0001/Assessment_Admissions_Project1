package Steps;

import Base.BaseUtil;
import Pages.Assessor_Login_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Base.BaseUtil.initialization;

public class Assessment_LoginStep extends BaseUtil {


    Assessor_Login_Page login_page = new Assessor_Login_Page(driver);




    @And("^Assessor enters ([^\"]*)and ([^\"]*)$")
    public void assessorEntersUsernameAndPassword(String Username, String Password) throws Throwable {

        login_page.Set_Username_Password(Username, Password);

    }

    @Given("^Assessor navigate to the SalesForce loginPage$")
    public void assessorNavigateToTheSalesForceLoginPage() throws Throwable {
        initialization();
        driver.get("https://test.salesforce.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);

    }

    @When("^I click login should be successfully logon into sandbox$")
    public void iClickLoginShouldBeSuccessfullyLogonIntoSandbox() throws Throwable {
        login_page.Click_Login();
        Thread.sleep(5000);
    }



    @Then("^I Navigate to Assessment Plans select Assessment Plan$")
    public void iNavigateToAssessmentPlansSelectAssessmentPlan() throws Throwable {
        login_page.Select_AssessmentPlans();
        Thread.sleep(4000);

    }

    @Then("^I Click on Omni-channel to see the available plans$")
    public void iClickOnOmniChannelToSeeTheAvailablePlans() throws Throwable {

        login_page.Click_OmniChannel();
    }

    @Then("^I make myself available in the channel$")
    public void iMakeMyselfAvailableInTheChannel() throws Throwable {

        Thread.sleep(2000);
        login_page.Click_Offline_DropDown();
        Thread.sleep(2000);
        login_page.Select_Available_FromDropDown();
        Thread.sleep(3000);
        login_page.Accept_Plan_FromGivenQueue();
        Thread.sleep(1000);
        login_page.minimize_Omnichannel_window();

    }

    @Then("^I logout from the a(\\d+) sandbox$")
    public void iLogoutFromTheASandbox(int arg0) throws Throwable {


    }


}

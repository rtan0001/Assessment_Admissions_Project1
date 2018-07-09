package Steps;

import Base.BaseUtil;
import Pages.Assessor_Login_Page;
import Pages.FieldValidations_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static Base.BaseUtil.initialization;

public class FieldValidations_Step extends BaseUtil {


    Assessor_Login_Page login_page = new Assessor_Login_Page(driver);

    FieldValidations_Page validation_page = new FieldValidations_Page(driver);

   List<String> options = new ArrayList<String>();




    @Then("^Navigate to Application select application Id and click on applicant$")
    public void navigateToApplicationSelectApplicationIdAndClickOnApplicant() throws Throwable {

        validation_page.Click_AllTabsSign();
        validation_page.Select_Applications_App();
        validation_page.Select_First_Application();
        validation_page.Click_Application_Details_button();
        validation_page.Click_Applicant_Contact_Link();
    }

    @Then("^I verify and Validate ([^\"]*) on contact details$")
    public void iVerifyAndValidateCitizenshipOnContactDetails(String Citizenship) throws Throwable {

       String Exp_citizenship =  validation_page.Get_Citizenship_FieldType();
       Assert.assertEquals(Exp_citizenship, Citizenship);
        options = validation_page.Get_Citizenship_dropdown_items();
        System.out.println("citizenship dropdown values are"+" "+ options);

    }



}

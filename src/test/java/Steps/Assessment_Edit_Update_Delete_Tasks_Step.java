package Steps;

import Base.BaseUtil;
import Pages.Assessment_Edit_Update_Delete_Steps_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Assessment_Edit_Update_Delete_Tasks_Step extends BaseUtil {

    Assessment_Edit_Update_Delete_Steps_Page Steps_Page = new Assessment_Edit_Update_Delete_Steps_Page(driver);



    @When("^I Select Assessment Plan From Active view$")
    public void iSelectAssessmentPlanFromActiveView() throws Throwable {

        Thread.sleep(2000);
        Steps_Page.Select_AssessentPlan_View();
        Thread.sleep(2000);
        Steps_Page.Select_MyActive_View();
        Thread.sleep(2000);
        Steps_Page.filter_plan_status();

    }


    @Then("^I Select first assessment plan from the list of plans$")
    public void iSelectFirstAssessmentPlanFromTheListOfPlans() throws Throwable {
        Thread.sleep(3000);
        Steps_Page.Select_First_Assessment_Plan();

    }

    @When("^I navigate to the Assessment Stps from the Assessment plan$")
    public void iNavigateToTheAssessmentStpsFromTheAssessmentPlan() throws Throwable {

        Thread.sleep(5000);
        Steps_Page.Navigate_To_Assessment_Steps("ASSESSMENT STEPS");

    }

    @Then("^I can be able to Edit and update Assessment Steps$")
    public void iCanBeAbleToEditAndUpdateAssessmentSteps() throws Throwable {

        Thread.sleep(3000);
        Steps_Page.Click_On_Edit_From_Step();
        Thread.sleep(2000);
        Steps_Page.Update_AssessmentStep_Status("Completed");
        Steps_Page.Update_Comments_AssessmentSteps();
        Steps_Page.Save_Updated_Task_Details();
    }

    @Then("^I can be able to Delete Assessment Steps$")
    public void iCanBeAbleToDeleteAssessmentSteps() throws Throwable {

        Thread.sleep(2000);
        Steps_Page.Delete_Assessment_Step();
        Steps_Page.Click_Close_AssessmentPlan_Task();



    }

    @Then("^I can be able Create a New Assessment Step$")
    public void iCanBeAbleCreateANewAssessmentStep() throws Throwable {

        Thread.sleep(2000);
        Steps_Page.Click_New_To_Create_AssessmentTask();
        Thread.sleep(3000);
        Steps_Page.Set_Assesment_Task_In_New_Assessment_Task();
        Steps_Page.Set_Type("Application Fee Check");
        Steps_Page.Adm_category("Domestic Commonwealth Supported Student");
        Steps_Page.Adm_category("Domestic Full-Fee Paying Student");
        Steps_Page.Adm_category("International Full-Fee Paying Student");
        Steps_Page.Set_Step_No();
        Steps_Page.Set_Outcome_Status_AssessmentTask("Not Assessed");
        Steps_Page.Save_Assessment_Task();
        Thread.sleep(10000);
        Steps_Page.Close_Assessment_Tab();
        Steps_Page.Click_Refresh_Button_AssessmentTasks();
//        Steps_Page.Click_Close_AssessmentPlan_Task();
    }


}


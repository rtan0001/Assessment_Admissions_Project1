package Steps;

import Base.BaseUtil;
import Pages.Assessment_Edit_Update_Delete_Steps_Page;
import Pages.Assesssor_Document_Checklist_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;

public class Assessment_Document_Checklist_Step extends BaseUtil {

    Assessment_Edit_Update_Delete_Steps_Page Steps_Page = new Assessment_Edit_Update_Delete_Steps_Page(driver);

    Assesssor_Document_Checklist_Page Doc_steps_page = new Assesssor_Document_Checklist_Page(driver);

    @And("^I Navigate to Application Documents Tab$")
    public void iNavigateToApplicationDocumentsTab() throws Throwable {

        Thread.sleep(2000);
        Steps_Page.Select_AssessentPlan_View();
        Thread.sleep(2000);
        Steps_Page.Select_MyActive_View();
        Thread.sleep(2000);
        Steps_Page.filter_plan_status();
        Thread.sleep(3000);
        Steps_Page.Select_First_Assessment_Plan();
        Thread.sleep(5000);
        Steps_Page.Navigate_To_Assessment_Steps("APPLICATION DOCUMENTS");


    }

    @And("^I Edit Document and change document status and update comments then hit Save$")
    public void iEditDocumentAndChangeDocumentStatusAndUpdateCommentsThenHitSave() throws Throwable {

        Thread.sleep(3000);
        Steps_Page.Click_On_Edit_From_Step();
        Thread.sleep(2000);
        Doc_steps_page.Update_Application_Document_Status("Resubmit");
        Doc_steps_page.Update_Comments_Application_Documents_step();
        Doc_steps_page.Save_Updated_ApplicationDocument_Task_Details();

    }

    @And("^I Validate document status updates$")
    public void iValidateDocumentStatusUpdates() throws Throwable {

      Thread.sleep(4000);
      String Actual_doc_status =  Doc_steps_page.GetDocumentStatus();
      Assert.assertEquals("Resubmit", Actual_doc_status);
      String Assessor_Comments_Doc =  Doc_steps_page.GetAssessorComments();
      Assert.assertEquals("Resubmit required documents", Assessor_Comments_Doc);
      Steps_Page.Click_Close_AssessmentPlan_Task();

    }
}

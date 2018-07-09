package Steps;

import Base.BaseUtil;
import Pages.Assessment_Edit_Update_Delete_Steps_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class Assessment_Document_Checklist_Step extends BaseUtil {

    Assessment_Edit_Update_Delete_Steps_Page Steps_Page = new Assessment_Edit_Update_Delete_Steps_Page(driver);

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


    }

    @And("^I Validate document status updates$")
    public void iValidateDocumentStatusUpdates() throws Throwable {


    }
}

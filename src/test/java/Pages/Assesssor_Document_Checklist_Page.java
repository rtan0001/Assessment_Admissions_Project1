package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Assesssor_Document_Checklist_Page  extends BaseUtil {

    public Assesssor_Document_Checklist_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void Update_Application_Document_Status(String status_value)  {

        WebElement elemt =  driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/section[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/section[2]/div"));

        WebElement element = elemt.findElement(By.xpath("//*[@class='slds whitebg cDocumentAssessment']/div[2]/div[2]/div[2]/div/span/div/div/div/select"));

        List<WebElement> list_options = element.findElements(By.tagName("option"));

        for(WebElement option: list_options )
        {
            if(option.getText().equals(status_value))
            {
                option.click();
            }
        }
    }


    public void Update_Comments_Application_Documents_step()
    {


        WebElement Comments_Element  =  driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/section[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/section[2]/div"));

        Comments_Element.findElement(By.xpath("//*[@class='slds whitebg cDocumentAssessment']/div[2]/div[3]/div[2]/div/div/textarea")).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);

        Comments_Element.findElement(By.xpath("//*[@class='slds whitebg cDocumentAssessment']/div[2]/div[3]/div[2]/div/div/textarea")).sendKeys("Resubmit required documents");


    }



    public void Save_Updated_ApplicationDocument_Task_Details()
    {
        WebElement Element  =  driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/section[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/section[2]/div"));

        Element.findElement(By.xpath("//*[@class='slds whitebg cDocumentAssessment']/div[2]/div[1]/div[2]/div/button[1]")).click();

    }


    public  String  GetDocumentStatus()
    {
        driver.findElement(By.xpath("//*[@class='tabs__content active uiTab']/div/div/div[2]/div[2]/div[2]/div/div/div/span")).click();

        String  doc_status = driver.findElement(By.xpath("//*[@class='tabs__content active uiTab']/div/div/div[2]/div[2]/div[2]/div/div/div/span")).getText();

        return doc_status;

    }

    public  String  GetAssessorComments()
    {
        driver.findElement(By.xpath("//*[@class='tabs__content active uiTab']/div/div/div[2]/div[3]/div[2]/div/div/span")).click();

        String  Assessor_comments = driver.findElement(By.xpath("//*[@class='tabs__content active uiTab']/div/div/div[2]/div[3]/div[2]/div/div/span")).getText();

        return Assessor_comments;


    }


}

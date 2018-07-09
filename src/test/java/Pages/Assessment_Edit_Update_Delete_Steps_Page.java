package Pages;

import Base.BaseUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assessment_Edit_Update_Delete_Steps_Page extends BaseUtil {

    public Assessment_Edit_Update_Delete_Steps_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Select_AssessentPlan_View()
    {
        driver.findElement(By.xpath("//*[@title='Select List View']/div")).click();
    }

    public void Select_MyActive_View() {


       WebElement ele_links =  driver.findElement(By.xpath("//*[@class='slds-dropdown__list slds-show']/li[2]"));

        Actions act = new Actions(driver);
        act.moveToElement(ele_links).click().build().perform();
    }


    public void Filter_plan_Status() {


        WebElement element = driver.findElement(By.xpath("//*[@class='forceListViewManagerGrid']/div[2]/div/div/div/table/tbody/tr"));

        List<WebElement> list_elements = element.findElements(By.tagName("td"));

        for (WebElement table_items : list_elements) {
            List<WebElement> elem_text = table_items.findElements(By.tagName("span"));
            int ele_count = elem_text.size();
            System.out.println(ele_count);

            for (int i=0;i<=ele_count ; i++)
            {
//
                if (elem_text.get(i).getText() == "Not started") {

                    System.out.println(elem_text.get(i).getText());
//                    WebElement element2 = driver.findElement(By.xpath("//*[@class='forceListViewManagerGrid']/div[2]/div/div/div/table/thead/tr"));

//                    List<WebElement> list_elements2 = element2.findElements(By.tagName("th"));
//                    for (WebElement col_items : list_elements2) {
//
//                    }
                }
            }


        }
    }



    public void filter_plan_status()
    {
        WebElement element = driver.findElement(By.xpath("//*[@class='forceListViewManagerGrid']/div[2]/div/div/div/table/tbody/tr"));

        List<WebElement> list_elements = element.findElements(By.tagName("td"));

        int lst_cnt = list_elements.size();

        for(int i=0;i<= lst_cnt; i++)
        {
            if(i == 6)
            {
              WebElement txt_items =  list_elements.get(i).findElement(By.tagName("span"));
//               String item_text =  txt_items.findElement(By.tagName("span")).getText();

                 if(txt_items.findElement(By.tagName("span")).getText().equals("Offer"))
                 {
                   WebElement row_items = driver.findElement(By.xpath("//*[@class='forceListViewManagerGrid']/div[2]/div/div/div/table/thead/tr"));
                    List<WebElement> items_list =  row_items.findElements(By.tagName("th"));
                    int lst_Cnt = items_list.size();

                    for(int j=0;j<=lst_Cnt; j++) {
                        if (j == 7) {
                            WebElement div_items = items_list.get(j).findElement(By.tagName("div"));

                            WebElement anchor_tags = div_items.findElement(By.tagName("a"));

                            List<WebElement> span_items = anchor_tags.findElements(By.tagName("span"));
                            for (WebElement spn_lst : span_items) {
                                if (spn_lst.getText().equals("PLAN STATUS")) {
                                    spn_lst.click();
                                    break;
                                }
                            }
                        }
                    }
                    }

                    else
                 {
                     System.out.println("Plan status already in sorted order");
                 }


                 }

            }

        }


    public void Select_First_Assessment_Plan() {
        WebElement row_items = driver.findElement(By.xpath("//*[@class='forceListViewManagerGrid']/div[2]/div/div/div/table/tbody/tr"));
        WebElement items_list = row_items.findElement(By.tagName("th"));

        WebElement span_elemt =  items_list.findElement(By.tagName("span"));

        WebElement  tag_items = span_elemt.findElement(By.tagName("a"));

        if(tag_items.getText() != (""))
        {
           tag_items.click();

         }

    }

    public void Navigate_To_Assessment_Steps(String col_tabs)
    {
       WebElement element =  driver.findElement(By.xpath("//*[@id='brandBand_3']/div/div/div/div[2]/div[1]/div[2]/div/div/ul")) ;

      List<WebElement> list_items = element.findElements(By.tagName("li"));

      for(WebElement items: list_items)
      {
         WebElement tag_ele =  items.findElement(By.tagName("a"));

         List<WebElement> span_items = tag_ele.findElements(By.tagName("span"));

         for(WebElement item:span_items )
         {
            if(item.getText().equals(col_tabs))
            {
                JavascriptExecutor jse = (JavascriptExecutor)driver;
                jse.executeScript("window.scrollBy(0,250)", "");
                Actions act = new Actions(driver);
                act.moveToElement(item).click().build().perform();
//                item.click();

            }
         }
      }
    }




    public WebElement expandRootElement(WebElement element) {

        WebElement ele = (WebElement) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot", element);

        return ele;
    }



    public void Click_On_Edit_From_Step() throws Throwable {

        WebElement ele1 = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/section[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/section[2]/div/div/div[2]/div/div[2]"));
        List<WebElement> btn_list  = ele1.findElements(By.tagName("button"));

        System.out.println(btn_list.size());

        for(int i=0;i<=btn_list.size(); i++)
        {
            if(i==0)
            {

                btn_list.get(i).click();


            }
        }



    }

 public void Update_AssessmentStep_Status(String status_value) throws Throwable {

     WebElement elemt =  driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/section[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/section[2]/div"));

     WebElement element = elemt.findElement(By.xpath("//*[@class='slds whitebg cAssessmentChecklist']/div[2]/div[2]/div[2]/div/span/div/div/div/select"));

     List<WebElement> list_options = element.findElements(By.tagName("option"));

    for(WebElement option: list_options )
     {
        if(option.getText().equals(status_value))
        {
            option.click();
        }
     }
 }


 public void Update_Comments_AssessmentSteps()
 {


     WebElement Comments_Element  =  driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/section[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/section[2]/div"));

     Comments_Element.findElement(By.xpath("//*[@class='slds whitebg cAssessmentChecklist']/div[2]/div[3]/div[2]/div/div/textarea")).sendKeys("Application Fee Verified");


 }

 public void Save_Updated_Task_Details()
 {
     WebElement Element  =  driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/section[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/section[2]/div"));

     Element.findElement(By.xpath("//*[@class='slds whitebg cAssessmentChecklist']/div[2]/div[1]/div[2]/div/button[1]")).click();

 }



 public void Delete_Assessment_Step()   {
     WebElement ele1 = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/section[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/section[2]/div/div/div[2]/div/div[2]"));
     List<WebElement> btn_list  = ele1.findElements(By.tagName("button"));

     System.out.println(btn_list.size());

     for(int i=0;i<=btn_list.size(); i++)
     {
         if(i==1)
         {
             btn_list.get(i).click();
             driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            Alert alert = driver.switchTo().alert();
            alert.accept();
         }
     }




 }



 public void Click_New_To_Create_AssessmentTask()
 {

     WebElement Element  =  driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/section[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/section[2]/div"));

     Element.findElement(By.xpath("//*[@class='slds whitebg cAssessmentChecklist']/div[1]/div/div[2]/div/button[1]")).click();



 }

 public void Set_Assesment_Task_In_New_Assessment_Task()
 {
     driver.findElement(By.xpath("//*[@class='test-id__section-content slds-section__content section__content']/div/div/div[1]/div/div/div/input")).sendKeys("Application Fee Check2");

     driver.findElement(By.xpath("//*[@class='test-id__section-content slds-section__content section__content']/div/div/div[1]/div/div/div/input")).sendKeys(Keys.TAB);

 }

public void Set_Type(String type)
{
    driver.findElement(By.xpath("//*[@class='test-id__section-content slds-section__content section__content']/div/div[1]/div[1]/div/div/div/div/div/div/div/a")).click();

    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

   WebElement list_elemts =  driver.findElement(By.xpath("/html/body/div[7]/div/ul"));

   List<WebElement> list_items =  list_elemts.findElements(By.tagName("li"));

   for(WebElement item:list_items)
   {
      String title_text =  item.findElement(By.tagName("a")).getAttribute("title");

      if(title_text.equals(type))
      {
          item.findElement(By.tagName("a")).click();
          break;
      }
   }

}

public void Adm_category(String adm_category)
{
  WebElement element = driver.findElement(By.xpath("//*[@class='test-id__section-content slds-section__content section__content']/div/div[2]/div[1]/div/div/div/select"));

   List<WebElement> option_items = element.findElements(By.tagName("option"));

   for(WebElement items: option_items)
   {
      if(items.getText().equals(adm_category))
      {
          items.click();
          break;

      }
   }
}

 public void Set_Step_No()
 {
    driver.findElement(By.xpath("//*[@class='test-id__section-content slds-section__content section__content']/div/div[1]/div[2]/div/div/div/input")).click();
    driver.findElement(By.xpath("//*[@class='test-id__section-content slds-section__content section__content']/div/div[1]/div[2]/div/div/div/input")).sendKeys("13");
   driver.findElement(By.xpath("//*[@class='test-id__section-content slds-section__content section__content']/div/div[1]/div[2]/div/div/div/input")).sendKeys(Keys.TAB, Keys.TAB, Keys.TAB);
 }

 public void Set_Outcome_Status_AssessmentTask(String status_outcome)
 {
      WebElement element = driver.findElement(By.xpath("//*[@class='full forcePageBlock forceRecordLayout']/div[4]/div/div/div/div/div/div/div/div/div/div/div/a"));

//    int cnt_items =  select_items.size();
//  label1: for(WebElement each_item: select_items)
//   {
//
//       System.out.println(each_item.getText());
//
//      if(each_item.getText().contains("--None--")) {
//
     JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("window.scrollBy(0,250)", "");
     Actions act = new Actions(driver);
     act.moveToElement(element).click().build().perform();


//          Actions act = new Actions(driver);
//          act.moveToElement(element).click().build().perform();
////          each_item.click();

          driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

          WebElement element2 = driver.findElement(By.xpath("/html/body/div[8]/div/ul"));

          List<WebElement> list_items = element2.findElements(By.tagName("li"));

         label2: for (WebElement item : list_items) {
              String title_text = item.findElement(By.tagName("a")).getAttribute("title");

              if (title_text.equals(status_outcome)) {
                  item.findElement(By.tagName("a")).click();
                 break label2;

              }
          }



 }

public void Save_Assessment_Task()
{
    driver.findElement(By.xpath("//*[@class='inlineFooter']/div/div/button[3]/span")).click();


}

 public void Close_Assessment_Tab()
 {
     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

     WebElement element = driver.findElement(By.xpath("//*[@class='active hasFixedFooter oneWorkspace']/div/div/div/div/ul[2]"));

     List<WebElement> list_items =  element.findElements(By.tagName("li"));

       for(int i=0; i<=list_items.size(); i++)
         {
             if (i == 3) {
                 WebElement ele_click = list_items.get(i).findElement(By.tagName("div"));
                 WebElement btn_click = ele_click.findElement(By.tagName("button"));
                 Actions act = new Actions(driver);
                 act.moveToElement(btn_click).click().build().perform();
                 break;
             }
         }

 }

 public void Click_Refresh_Button_AssessmentTasks()
 {

     WebElement Element  =  driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div/div/div/section[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/section[2]/div"));

     Element.findElement(By.xpath("//*[@class='slds whitebg cAssessmentChecklist']/div[1]/div/div[2]/div/button[2]")).click();

 }

 public void Click_Close_AssessmentPlan_Task()
 {
     driver.findElement(By.xpath("//*[@id='oneHeader']/div[3]/div/div[2]/div/div/ul[2]/li[2]/div[2]/button")).click();
 }


}

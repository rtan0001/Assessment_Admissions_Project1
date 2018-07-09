package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Assessor_Login_Page extends BaseUtil {

    public Assessor_Login_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Set_Username_Password(String username, String password) {
        driver.findElement(By.xpath("//*[@id='username']")).clear();

        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);

        driver.findElement(By.xpath("//*[@id='password']")).clear();

        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
    }

    public void Click_Login() {
        driver.findElement(By.xpath("//*[@id='Login']")).click();
    }

    public void Select_AssessmentPlans() {
        driver.findElement(By.xpath("//*[@class='navMenu slds-context-bar__item--divider-right uiMenu oneAppNavMenu']/div/div/div/a")).click();

        WebElement element1 = driver.findElement(By.xpath("//*[@class='navMenu slds-context-bar__item--divider-right uiMenu oneAppNavMenu']/div[2]/div[1]"));

        WebElement list_items1 = element1.findElement(By.tagName("ul"));

        List<WebElement> list_items2 = list_items1.findElements(By.tagName("li"));

        int cnt_list = list_items2.size();

        for (int i = 0; i <= cnt_list; i++) {
            if (i == 1) {
                WebElement ele_links = list_items2.get(i).findElement(By.tagName("a"));
                Actions act = new Actions(driver);
                act.moveToElement(ele_links).click().build().perform();

            }
        }

    }

    public void Click_OmniChannel()
    {
        WebElement element1 = driver.findElement(By.xpath("//*[@class='flexipagePage']/div[1]/div[5]"));
        WebElement list_items = element1.findElement(By.tagName("ul"));

        List<WebElement> child_items = list_items.findElements(By.tagName("li"));

        int cnt_items = child_items.size();

        for (int i=0; i<= cnt_items; i++)
        {
            if(i == 0)
            {
                 child_items.get(i).findElement(By.tagName("span")).click();
//                int Cnt_span = btn_links.size();
//                for (int j=0; j<= Cnt_span; j++)
//                {
//                    if(j==2)
//                    {
//                        btn_links.get(j).click();
//                    }
//                }
            }
        }


    }

    public void Click_Offline_DropDown()
    {

//       /html/body/div[5]/div[1]/div/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button
          driver.findElement(By.xpath("//*[@class='flexipagePage']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button")).click();

    }

    public void Select_Available_FromDropDown()
    {
        WebElement element  = driver.findElement(By.xpath("//*[@class='slds-dropdown-trigger slds-dropdown-trigger_click slds-is-open']/div[1]/ul"));

        List<WebElement> list_items = element.findElements(By.tagName("li"));

        int cnt_items = list_items.size();

        for(int i=0;i<=cnt_items; i++)
        {
            if(i==0)
            {
                list_items.get(i).findElement(By.tagName("a")).click();
            }
        }
    }

    public void Accept_Plan_FromGivenQueue()
    {

       WebElement element1 = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[4]/div[1]/div[3]/div/div/div[2]/div/div"));

       if((element1).isDisplayed())
       {
           System.out.println("You have no active requests.");
       }
       else {

           WebElement element = driver.findElement(By.xpath("//*[@class='slds-utility-panel__body']/div[1]/div[2]/div[1]/section/div[1]/ul"));

           List<WebElement> list_items = element.findElements(By.tagName("li"));

           int cnt_items = list_items.size();

           for (int i = 0; i <= cnt_items; i++) {
               if (i == 0) {
                   List<WebElement> buttons_list = list_items.get(i).findElements(By.tagName("button"));

                   int cnt_button = buttons_list.size();

                   for (int j = 0; j <= cnt_button; j++) {
                       if (j == 0) {
                           buttons_list.get(j).click();
                       }
                   }
               }
           }
       }

    }


    public void minimize_Omnichannel_window()
    {
        driver.findElement(By.xpath("//*[@class='flexipagePage']/div[1]/div[3]/a/div[1]/div[2]/span/button")).click();
    }


    public void LogOut_Sandbox()
    {

    }


}

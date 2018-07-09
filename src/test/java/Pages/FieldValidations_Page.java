package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class FieldValidations_Page  extends BaseUtil {

    public FieldValidations_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Click_AllTabsSign() {
        driver.findElement(By.xpath("//*[@id='AllTab_Tab']/a/img")).click();
    }

    public void Select_Applications_App() {
        driver.findElement(By.xpath("//*[@id='bodyCell']/div[3]/div[2]/table/tbody/tr[9]/td[1]/a")).click();
    }

    public void Select_First_Application() {
        driver.findElement(By.xpath("//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")).click();
    }

    public void Click_Application_Details_button() {
        driver.findElement(By.xpath("//*[@id='efpViews_a240l000000A8wt_option1']/span[2]")).click();
    }

    public void Click_Applicant_Contact_Link() {
        driver.findElement(By.xpath("//*[@id='CF00N2800000IgX0C_ilecell']/div[1]/a")).click();
    }


    public String Get_Citizenship_FieldType() {
        WebElement element = driver.findElement(By.xpath("//*[@id='ep']/div[2]/div[4]/table/tbody"));
        List<WebElement> child_items = element.findElements(By.tagName("td"));
//        int cnt = child_items.size();
        String citizenship_field = null;
        for(WebElement items : child_items) {

            if(items.getText().equals("Citizenship")) {
                citizenship_field = items.getText();
                System.out.println(citizenship_field+" "+"exists");
                break;
            }

        }
        return citizenship_field;

    }

   public List Get_Citizenship_dropdown_items() throws InterruptedException {

       List<String> options = new ArrayList<String>();
       WebElement element =  driver.findElement(By.xpath("//*[@id='ep']/div[2]/div[4]/table/tbody/tr[3]/td[4]/div[1]"));
       Actions act = new Actions(driver);
       act.moveToElement(element).doubleClick().build().perform();

       Thread.sleep(2000);

//       WebElement dropdown_items = driver.findElement(By.xpath("//*[@id='ep']/div[2]/div[4]/table/tbody/tr[3]/td[4]/div[2]/span/select"));
//
//          List<WebElement> option_items = dropdown_items.findElements(By.tagName("option"));
//
//          for(WebElement option: option_items)
//          {
//              String txt = option.getText();
////
//            if(option.getAttribute("value") != "") options.add(option.getText());
//          }

       for(WebElement option: new Select(driver.findElement(By.xpath("//*[@id='ep']/div[2]/div[4]/table/tbody/tr[3]/td[4]/div[2]/span/select"))).getOptions())
       {
           String txt = option.getText();

           if(option.getAttribute("value") != "") options.add(option.getText());
       }
       return options;
   }

}

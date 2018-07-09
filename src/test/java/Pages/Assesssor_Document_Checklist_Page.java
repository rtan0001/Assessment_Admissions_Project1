package Pages;

import Base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Assesssor_Document_Checklist_Page  extends BaseUtil {

    public Assesssor_Document_Checklist_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }




}

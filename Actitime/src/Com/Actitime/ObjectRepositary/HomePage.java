package Com.Actitime.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Actitime.GenericLibrary.BaseClass;

     public class HomePage extends BaseClass{
	 @FindBy(xpath="//div[.='Tasks']")
	 private WebElement tasktab;
	
	 @FindBy(xpath="//div[.='Reports']")
	 private WebElement reportyerstab;
	
	 @FindBy(xpath="//div[.='Users']")
	 private WebElement userstab;
	
	 //inialization
	 public HomePage(WebDriver driver ) {
	 PageFactory.initElements(driver,this);
		
		//utilization
     }
	 public WebElement getTasktab() {
	 return tasktab;
	}
	 public WebElement getReportyerstab() {
	 return reportyerstab;
	}
	 public WebElement getUserstab() {
	 return userstab;
	}
    }
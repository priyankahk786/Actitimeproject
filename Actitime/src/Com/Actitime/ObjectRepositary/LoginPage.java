package Com.Actitime.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Actitime.GenericLibrary.BaseClass;

     public class LoginPage extends BaseClass{
	//declaration
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='login ']")
	private WebElement lgbtn;


     //initialization
	public LoginPage()
	{
    PageFactory.initElements(driver,this);
}

    //utilization
     public WebElement getUntbx() {
	 return untbx;
}
 
     public WebElement getPwtbx() {
	 return pwtbx;
}

     public WebElement getLgbtn() {
     return lgbtn;
}
}
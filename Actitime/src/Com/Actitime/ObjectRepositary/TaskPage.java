package Com.Actitime.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Actitime.GenericLibrary.BaseClass;

public class TaskPage{
	//declaration
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[.='New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name'][2]")
    private WebElement custname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesp;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcust;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelbtn;
	
	@FindBy(xpath = "//div[.='\"+createcustomer+\"']")
	private WebElement dynamicxpath;
	
	//initilization
	public TaskPage(WebDriver driver ) {
		PageFactory.initElements(driver,this);
		
		//utilization
		
}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesp() {
		return custdesp;
	}

	public WebElement getCreatecust() {
		return createcust;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}}

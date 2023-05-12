package Com.Actitime.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com.Actitime.ObjectRepositary.LoginPage;

    public class BaseClass {
	public static WebDriver driver;
	LoginPage lg= new LoginPage();
    @BeforeSuite
    public void databaseconnection() {
	Reporter.log("data base is connected",true);
    }
	
    @BeforeClass 
	public void launchthebrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com");
	Reporter.log("browser is launched successfully",true);	
	}

    @BeforeMethod
    public void login() {
	lg.getUntbx().sendKeys("admin");
	lg.getPwtbx().sendKeys("manager");
	lg.getLgbtn().click();
    Reporter.log("succesfully loged in",true);
    }

    @AfterMethod
     public void logout() {
	driver.findElement(By.id("logoutLink")).click();
	Reporter.log("succesfully loged out",true);	
    }
    @AfterClass
    public void closethebrowser() {
	driver.close();
	Reporter.log("browser is closed succesfully",true);
    }
    @AfterSuite
     public void databasedissconnection() {
	Reporter.log("database is disconnected",true);
    }
    }
	



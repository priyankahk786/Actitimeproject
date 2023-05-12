
package Com.Actitime.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.Actitime.GenericLibrary.BaseClass;
import Com.Actitime.GenericLibrary.FileLibrary;
import Com.Actitime.ObjectRepositary.HomePage;
import Com.Actitime.ObjectRepositary.TaskPage;

        public class task  extends BaseClass{
	    @Test
	    public void CreateCustomer() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.getTasktab().click();
		TaskPage tp = new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcust().click();
		tp.getCustname().sendKeys();
		
		FileLibrary f = new FileLibrary();
		String createcustomer = f.readdatafromexcel("sheet1",1,1);
		tp.getCustname().sendKeys(createcustomer);
		
		String description = f.readdatafromexcel("sheet1", 1, 2);
		tp.getCustdesp().sendKeys(description);
		tp.getCreatecust().click();
		String expectedresult = createcustomer;
	    String actualresult = driver.findElement(By.xpath("//div[.='\"+createcustomer+\"']")).getText();
		
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualresult, expectedresult);
		s.assertAll();
}
}
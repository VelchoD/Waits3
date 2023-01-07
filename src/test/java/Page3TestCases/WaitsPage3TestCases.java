package Page3TestCases;

import org.testng.annotations.Test;

import Base.Base;
import PageObjects.Page3Objects;
import testdata.testdata;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class WaitsPage3TestCases extends Base {
	
	Page3Objects pw;
	testdata td ;

 
  @BeforeMethod
  public void beforeMethod()  {

		openApplication();
		pw = new Page3Objects();
		td = new testdata();
	}
  
  @Test
  public void TestWaits3() {
	  pw.Page3 ();
	  String actualtext=driver.findElement(By.xpath("//p[@id='buttonmessage']")).getText();
	  Assert.assertEquals(actualtext,td.expectedtext);
	  System.out.println(actualtext);
		 
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
  }  
 }


package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.Base;
import testdata.testdata;

public class Page3Objects extends Base {
	
	 testdata td=new testdata ();
	 
	//Web element one
	@FindBy(xpath ="//button[@id='button00']")
	WebElement start;

	//Web element one
	@FindBy(xpath ="//button[@id='button01']")
	WebElement one;
	
	//Web element two
	@FindBy(xpath = "//button[@id='button02']")
	WebElement two;
	
	//Web element three
	@FindBy(xpath = "//button[@id='button03']")
	WebElement three;
	
	//Web element text
	@FindBy(xpath = "//p[@id='buttonmessage']")
	WebElement text;
	
	//Init Elements
	public Page3Objects() {
		PageFactory.initElements(driver, this);
	}
	
	/*Mehod*/
	public void Page3() {
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='button00']")));
		start.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='button01']")));
		one.click();
		wait.until(ExpectedConditions.elementToBeClickable (By.xpath("//button[@id='button02']")));
		two.click();
		wait.until(ExpectedConditions.elementToBeClickable (By.xpath("//button[@id='button03']")));
		three.click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='buttonmessage']")));
	    text.isDisplayed();
	    
	}
}

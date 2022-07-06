package PageFactory;

import java.time.Duration;

import java.util.Currency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	
	WebDriver driver;

    
	@FindBy(xpath="//a[contains(text(),'flights')]")
	WebElement flights;
	    
	@FindBy(id="currency")
	WebElement currency;
 
    @FindBy(xpath="//a[contains(text(),'INR')]")
    WebElement INR;
 
    
    public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		//Get the Title of HomePage
		String HomePageTitle=driver.getTitle();
	      System.out.println("The title of the Homepage is :"+HomePageTitle);
	      if(driver.findElement(By.xpath("//span[contains(text(),'Demo')]")).isEnabled()) {
	          System.out.println("Hi ,Demo Welcome Back");
	      }
}

	public void clickflights() {
		flights.click();
		
	}
	public void clickcurrency() {
		currency.click();
		
	}
	public void clickINR() {
		INR.click();
		
	}
}

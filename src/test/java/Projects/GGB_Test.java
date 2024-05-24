package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GGB_Test
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://rajtensilestructure.com/"); 
	}
	@Test(priority=1)
	void Access_Projects() 
	{
		WebElement Projects =driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-14087\"]"));
		Projects.click();
	}
	@Test(priority=2)
	void HomeIcon()  
	{
		WebElement HI =driver.findElement(By.xpath("(//a[@class='home'])[1]"));
		HI.click();
		driver.navigate().back();
	}
	@Test(priority=3)
	void GulmoharGardenBhopal() throws InterruptedException 
	{
		WebElement OpenImage =driver.findElement(By.xpath("//a[@title='Gulmohar garden Bhopal Madhya Pradesh']//i[@class='fa fa-arrows-alt']"));
		Actions a= new Actions(driver);
		a.moveToElement(OpenImage).click().perform();
		Thread.sleep(2000);
		WebElement ExpandImage =driver.findElement(By.xpath("//a[@title='Expand the image']"));
		ExpandImage.click();
		WebElement PlayImage =driver.findElement(By.xpath("//a[@class='pp_play']"));
		PlayImage.click();
		Thread.sleep(2000);
		WebElement PreviousImage =driver.findElement(By.xpath("//a[@class='pp_previous']"));
		PreviousImage.click();
		WebElement NextImage =driver.findElement(By.xpath("//a[@class='pp_next']"));
		NextImage.click();
		Thread.sleep(2000);	
		WebElement CloseImage =driver.findElement(By.xpath("//a[@class='pp_close']"));
		CloseImage.click();
		Thread.sleep(2000);	
	}
	@Test(priority=4)
	void GGB() 
	{
	    WebElement GGB =driver.findElement(By.xpath("//a[@href='https://rajtensilestructure.com/portfolio/gulmohar-garden-bhopal-madhya-pradesh/']//i[@class='fa fa-eye']"));
    	Actions a= new Actions(driver);
    	a.moveToElement(GGB).click().perform();
		WebElement ShareToFacebook =driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[1]"));
		ShareToFacebook.click();
		WebElement ShareToTwitter =driver.findElement(By.xpath("//i[@class='fa fa-twitter']"));
		ShareToTwitter.click();
		WebElement ShareToGoogleplus =driver.findElement(By.xpath("//i[@class='fa fa-google-plus']"));
		ShareToGoogleplus.click();
	}
	@Test(priority=5)
	void RajTensileLogo()  
	{
		WebElement logo =driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//div[@class='elementor-column elementor-col-33 elementor-top-column elementor-element elementor-element-2ae7f28']//a"));
		logo.click();
	}
	@AfterTest()
	void close()
	{
		driver.quit();
	}
}

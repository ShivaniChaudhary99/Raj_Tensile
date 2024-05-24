package ContactUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactUs_Test
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://rajtensilestructure.com/"); 
	}
	@Test(priority=1)
	void Access_ContactUs() 
	{
		WebElement ContactUs =driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-14086\"]"));
		ContactUs.click();
	}
	@Test(priority=2)
	void HomeIcon()  
	{
		WebElement HI =driver.findElement(By.xpath("(//a[@class='home'])[1]"));
		HI.click();
		driver.navigate().back();
	}
	@Test(priority=3)
	void AddressPage() 
	{
		WebElement AP =driver.findElement(By.xpath("//i[@class='fa fa-road']"));
		AP.click();
	}
	@Test(priority=4)
	void PhoneNumber() 
	{
		WebElement PN =driver.findElement(By.xpath("//i[@class='fa fa-phone']"));
		PN.click();
	}
	@Test(priority=5)
	void Email() 
	{
		WebElement E=driver.findElement(By.xpath("//i[@class='fa fa-envelope']"));
		E.click();
	}
	@Test(priority=6)
	void SendMessage() throws InterruptedException 
	{
		WebElement Name=driver.findElement(By.xpath("//input[@id='your-name']"));
		WebElement Email=driver.findElement(By.xpath("//input[@name=\"your-email\"]"));
		WebElement Message=driver.findElement(By.xpath("//textarea[@id='your-message']"));
		Name.sendKeys("SHIVANI");
		Email.sendKeys("annukumariverma99@gail.com");
		Message.sendKeys("Hello");
		Thread.sleep(2000);
		WebElement Submit=driver.findElement(By.xpath("//input[@id='submit']"));
		Submit.click();
		
	}
	@Test(priority=7)
	void RajTensileStructurelink() 
	{
		WebElement RTS=driver.findElement(By.xpath("//span[contains(text(),'© 2023 Raj Tensile Structure')]"));
		RTS.click();
		driver.switchTo().defaultContent();
	}
	@Test(priority=8)
	void LINKS() throws InterruptedException 
	{
		WebElement Home=driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-home menu-item-14351\"]"));
		Home.click();
		driver.navigate().back();
		WebElement AboutUs=driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-14352\"]"));
		AboutUs.click();
		driver.navigate().back();
		WebElement Projects=driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-14353\"]"));
		Projects.click();
		driver.navigate().back();
		WebElement ContactUs=driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-117 current_page_item menu-item-14354\"]"));
		ContactUs.click();
		Thread.sleep(2000);
	}
	@Test(priority=9)
	void SOCIAL_LINKS() throws InterruptedException 
	{
		WebElement Facebook=driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-13626\"]"));
		Facebook.click();
		driver.switchTo().defaultContent();
		WebElement Linkedin=driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-13627\"]"));
		Linkedin.click();
		driver.switchTo().defaultContent();
		WebElement Instagram=driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-13628\"]"));
		Instagram.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
	@Test(priority=10)
	void RajTensileLogo()  
	{
		WebElement logo =driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//div[@class='elementor-column elementor-col-33 elementor-top-column elementor-element elementor-element-2ae7f28']//a"));
		logo.click();
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
}

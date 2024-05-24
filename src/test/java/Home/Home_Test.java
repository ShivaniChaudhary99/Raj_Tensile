package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home_Test 
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://rajtensilestructure.com/"); 
	}
	@Test(priority=1)
	void Access_Home() throws InterruptedException 
	{
		WebElement Home =driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//nav[@class='elementor-nav-menu--main elementor-nav-menu__container elementor-nav-menu--layout-horizontal e--pointer-underline e--animation-fade']//a[@class='elementor-item elementor-item-active'][normalize-space()='Home']"));
		Home.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	void DiscoverMore() throws InterruptedException
	{
	    WebElement DM= driver.findElement(By.xpath("//a[@id='slider-1-slide-1-layer-0']"));
	    DM.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority=3)
	void NextSlide() throws InterruptedException 
	{
		WebElement NS =driver.findElement(By.xpath("//rs-arrow[@class='tp-rightarrow tparrows zeus']"));
		NS.click();
		Thread.sleep(2000);
	}
	@Test(priority=4)
	void ContactUs() throws InterruptedException 
	{
		WebElement CU =driver.findElement(By.xpath("//span[@data-stylerecorder='true'][normalize-space()='Contact Us']"));
		CU.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	@Test(priority=5)
	void PreviousSlide() throws InterruptedException 
	{
		WebElement PS =driver.findElement(By.xpath("//rs-arrow[@class='tp-leftarrow tparrows zeus']"));
		PS.click();
	}
	@AfterTest(enabled=false)
	void close()
	{
		driver.quit();
	}
}

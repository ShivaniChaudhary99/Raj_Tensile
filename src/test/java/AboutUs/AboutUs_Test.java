package AboutUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AboutUs_Test
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://rajtensilestructure.com/"); 
	}
	@Test(priority=1)
	void Access_AboutUs() 
	{
		WebElement AboutUs =driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-14085\"]"));
		AboutUs.click();
	}
	@Test(priority=2)
	void HomeIcon()  
	{
		WebElement HI =driver.findElement(By.xpath("(//a[@class='home'])[1]"));
		HI.click();
		driver.navigate().back();
	}
	@Test(priority=3)
	void CompanyProfile() 
	{
		WebElement CP =driver.findElement(By.xpath("//i[@class='fa fa-suitcase']"));
		CP.click();
	}
	@Test(priority=4)
	void PreviousAndNextQuote()  
	{
		WebElement Prev =driver.findElement(By.xpath("//div[@class=\"owl-prev\"]"));
		Prev.click();
		WebElement Next =driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
		Next.click();
	}
	@Test(priority=5)
	void WhyChooseUs() 
	{
		WebElement YOE =driver.findElement(By.xpath("(//span[@class='vc_tta-title-text'])[1]")); //Years of Experience
		YOE.click();
		WebElement BM =driver.findElement(By.xpath("(//span[@class='vc_tta-title-text'])[2]")); //Best Materials
		BM.click();
		WebElement PS =driver.findElement(By.xpath("(//span[@class='vc_tta-title-text'])[3]")); //Professional Standards
		PS.click();
	}
	@Test(priority=6)
	void BestFeatures() 
	{
		WebElement Construction =driver.findElement(By.xpath("//span[normalize-space()='Construction']"));
		Construction.click();
		WebElement BPE =driver.findElement(By.xpath("//span[normalize-space()='Best possible equipment']")); //Best Possible Equipment
		BPE.click();
		WebElement ET =driver.findElement(By.xpath("//span[normalize-space()='Experienced Teams']")); //Experienced Teams
		ET.click();
	}
	@Test(priority=7)
	void OurTeam() 
	{
		WebElement Facebook =driver.findElement(By.xpath("//i[@class=\"fa fa-facebook-f\"]"));
		Facebook.click();
		WebElement Twitter =driver.findElement(By.xpath("//i[@class=\"fa fa-twitter\"]"));
		Twitter.click();
		WebElement Linkedin =driver.findElement(By.xpath("//i[@class=\"fa fa-linkedin\"]"));
		Linkedin.click();
		WebElement GooglePlus =driver.findElement(By.xpath("//i[@class=\"fa fa-google-plus\"]"));
		GooglePlus.click();
	}
	
	@Test(priority=8)
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

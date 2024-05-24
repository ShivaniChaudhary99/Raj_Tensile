package Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WalkwayTensileStructure_Test 
{
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://rajtensilestructure.com/"); 
	}
	@Test(priority=1)
	void Access_WTS() 
	{
		WebElement Services =driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14313\"]"));
		Services.click();	   
	    WebElement Walkway =driver.findElement(By.xpath("(//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-14318\"])"));
	    Walkway.click();
	}
	@Test(priority=2)
	void PreviousAndNext() throws InterruptedException 
	{
		WebElement Previous =driver.findElement(By.xpath("//a[@class='flex-prev']"));
		Previous.click();
		Thread.sleep(2000);	
		WebElement Next =driver.findElement(By.xpath("//a[@class='flex-next']"));
		Next.click();
		Thread.sleep(2000);			
		}
	@Test(priority=3)
	void DesignAndCreativity()
	{
		WebElement DC =driver.findElement(By.xpath("//a[normalize-space()='Design & Creativity']"));
		DC.click();
	}
	@Test(priority=4)
	void EngineeringInnovation() 
	{
		WebElement EI =driver.findElement(By.xpath("//a[normalize-space()='Engineering Innovation']"));
		EI.click();
	}
	@Test(priority=5)
	void FabricationQuality()
	{
		WebElement FQ =driver.findElement(By.xpath("//a[normalize-space()='Fabrication Quality']"));
		FQ.click();
	}
	@Test(priority=6)
	void ConstructionService() 
	{
		WebElement CS =driver.findElement(By.xpath("//a[normalize-space()='Construction Service']"));
		CS.click();
		driver.navigate().refresh();
	}
	@Test(priority=7)
	void FlexibleDesignAsthetics()
	{
		WebElement FDA =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[1]"));
		FDA.click();
	}
	@Test(priority=8)
	void ExcellentDurability()
	{
		WebElement ED =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[2]"));
		ED.click();
	}
	@Test(priority=9)
	void PriviousButton() 
	{
		WebElement PB =driver.findElement(By.xpath("//div[@class=\"owl-prev\"]"));
		PB.click();
	}
	@Test(priority=10)
	void LowMaintenance() 
	{
		WebElement LM =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[3]"));
		LM.click();
	}
	@Test(priority=11)
	void OutstandingTranslucency()
	{
		WebElement OT =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[4]"));
		OT.click();
	}
	@Test(priority=12)
	void NextButton()
	{
		WebElement NB =driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(NB).doubleClick();
	}
	@Test(priority=13)
	void LightweightNature() 
	{
		WebElement LN =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[5]"));
		LN.click();
	}
	@Test(priority=14)
	void NextButton2() 
	{
		WebElement NB2=driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(NB2).doubleClick();
	}
	@Test(priority=15)
	void CostBenefits() 
	{
		WebElement CB =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[6]"));
		CB.click();
		driver.navigate().refresh();
	}
	@Test(priority=16,enabled=false)
	void HomeIcon()  
	{
		WebElement HI =driver.findElement(By.xpath("//a[@class='home']"));
		HI.click();
	}
	@Test(priority=17)
	void RajTensileLogo()  
	{
		WebElement logo =driver.findElement(By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-256c209 elementor-section-content-middle elementor-section-height-min-height elementor-hidden-tablet elementor-hidden-mobile elementor-section-boxed elementor-section-height-default elementor-section-items-middle elementor-sticky elementor-sticky--active elementor-section--handles-inside elementor-sticky--effects animated fadeIn']//div[@class='elementor-column elementor-col-33 elementor-top-column elementor-element elementor-element-2ae7f28']//a"));
		logo.click();
	}
	@AfterTest
	void close()
	{
		driver.quit();
}}


package Services;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarParkingTensileStructure_Test {
	String driverPath = "F:\\Webdriver\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate()  
	{
		driver.get("https://rajtensilestructure.com/"); 
	}
	@Test(priority=1)
	void Access_CPTS() 
	{
		WebElement Services =driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-14313\"]"));
		Services.click();	   
	    WebElement CarParking =driver.findElement(By.xpath("(//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-14314\"])"));
	    CarParking.click();
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
	void DesignAndCreativity() throws InterruptedException 
	{
		WebElement DC =driver.findElement(By.xpath("//a[normalize-space()='Design & Creativity']"));
		DC.click();
		Thread.sleep(2000);
	}
	@Test(priority=4)
	void EngineeringInnovation() throws InterruptedException 
	{
		WebElement EI =driver.findElement(By.xpath("//a[normalize-space()='Engineering Innovation']"));
		EI.click();
		Thread.sleep(2000);
	}
	@Test(priority=5)
	void FabricationQuality() throws InterruptedException 
	{
		WebElement FQ =driver.findElement(By.xpath("//a[normalize-space()='Fabrication Quality']"));
		FQ.click();
		Thread.sleep(2000);
	}
	@Test(priority=6)
	void ConstructionService() throws InterruptedException 
	{
		WebElement CS =driver.findElement(By.xpath("//a[normalize-space()='Construction Service']"));
		CS.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	@Test(priority=7)
	void FlexibleDesignAsthetics() throws InterruptedException 
	{
		WebElement FDA =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[1]"));
		FDA.click();
		Thread.sleep(1000);
	}
	@Test(priority=8)
	void ExcellentDurability() throws InterruptedException 
	{
		WebElement ED =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[2]"));
		ED.click();
		Thread.sleep(1000);
	}
	@Test(priority=9)
	void PriviousButton() throws InterruptedException 
	{
		WebElement PB =driver.findElement(By.xpath("//div[@class=\"owl-prev\"]"));
		PB.click();
		Thread.sleep(1000);
	}
	@Test(priority=10)
	void LowMaintenance() throws InterruptedException 
	{
		WebElement LM =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[3]"));
		LM.click();
		Thread.sleep(1000);
	}
	@Test(priority=11)
	void OutstandingTranslucency() throws InterruptedException 
	{
		WebElement OT =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[4]"));
		OT.click();
		Thread.sleep(2000);
	}
	@Test(priority=12)
	void NextButton() throws InterruptedException 
	{
		WebElement NB =driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(NB).doubleClick();
		Thread.sleep(1000);
	}
	@Test(priority=13)
	void LightweightNature() throws InterruptedException 
	{
		WebElement LN =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[5]"));
		LN.click();
		Thread.sleep(2000);
	}
	@Test(priority=14)
	void NextButton2() throws InterruptedException 
	{
		WebElement NB2=driver.findElement(By.xpath("//div[@class=\"owl-next\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(NB2).doubleClick();
		Thread.sleep(1000);
	}
	@Test(priority=15)
	void CostBenefits() throws InterruptedException 
	{
		WebElement CB =driver.findElement(By.xpath("(//div[@class=\"owl-item\"])[6]"));
		CB.click();
		Thread.sleep(1000);
	}
	@Test(priority=16,enabled=false)
	void HomeIcon() throws InterruptedException 
	{
		WebElement HI =driver.findElement(By.xpath("//a[@class='home']"));
		HI.click();
		Thread.sleep(1000);
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



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
		
		@Test
		public void Launch() throws InterruptedException
		{
			 WebDriver driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);	
			
		
		
		
			driver.findElement(By.xpath("//div[@class='fsw_inner returnPersuasion']//div[@class='flt_fsw_inputBox searchCity inactiveWidget ']//label[@for='fromCity']")).click();
			
			driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-3']")).click();
driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox searchToCity inactiveWidget ']")).click();
driver.findElement(By.xpath("//p[normalize-space()='Mumbai, India']")).click();
driver.findElement(By.xpath("//div[@class='DayPicker-Month']//div[@class='DayPicker-Week']//div[@aria-label=\"Sun Feb 25 2024\"]")).click();
driver.findElement(By.xpath("//div[@data-cy='returnArea']//label")).click();
driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]//div[@class='DayPicker-Body']//div[@class='DayPicker-Week']//div[@aria-label='Mon Mar 04 2024']")).click();
driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox flightTravllers inactiveWidget ']")).click();
driver.findElement(By.xpath("//div[@class='fltTravellers gbTravellers']//ul[@class='guestCounter font12 darkText gbCounter']//li[@data-cy='adults-5']")).click();
driver.findElement(By.xpath("//ul[@class='guestCounter classSelect font12 darkText']//li[text()='Business']")).click();
driver.findElement(By.xpath("//button[@class='primaryBtn btnApply pushRight']")).click();
driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@class='button buttonSecondry buttonBig fontSize12 relative']")).click();
Thread.sleep(5000);
driver.close();
		}
		
		
		
		
	}


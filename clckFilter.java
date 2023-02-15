package cmtaApplication;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class clckFilter {
	
	WebDriver driver; 
	String baseURL;
	

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseURL = "https://dev.clinical-transfer.smith-nephew.com/auth";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}


	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseURL);
		driver.findElement(By.xpath("//span[contains(text(), 'Close')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-0"));
		driver.findElement(By.id("mat-input-0")).sendKeys("harminder.bedi@datavid.co.uk");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
	    driver.findElement(By.id("mat-input-1")).sendKeys("Bravo@123!");
	    driver.findElement(By.xpath("//span[contains(text(), 'Login')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(), 'Filters')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='mat-date-range-input-container']")).click();
	    driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator'] [1]")).click();
	    
	  	

	}
	
	@After
	public void tearDown() throws Exception {
		
		//Thread.sleep(5000);
		//driver.quit();
		
	}

}

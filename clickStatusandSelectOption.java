package cmtaApplication;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickStatusandSelectOption {
	
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
	public void test() throws InterruptedException   {
		
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(), 'Close')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-0"));
		driver.findElement(By.id("mat-input-0")).sendKeys("harminder.bedi@datavid.co.uk");
	    driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("mat-input-1")).sendKeys("Bravo@123!");
	    driver.findElement(By.xpath("//span[contains(text(), 'Login')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(), 'Filters')]")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c134-5']")).click();
	    driver.findElement(By.xpath("//mat-option[@id = 'mat-option-6']/span[contains(text(), 'Pending Review')]"));
	    
	    
	    
		
	}
	
	@After
	public void tearDown() throws Exception {
		
		
	}

}

package cmtaApplication;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExternalAdminLogin {
	
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
		driver.findElement(By.id("mat-input-0")).sendKeys("admin");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
	    driver.findElement(By.id("mat-input-1")).sendKeys("H=E_f?rnyk=wm29P");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(), 'Login')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a/span[contains(text(), 'View audits')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='mat-select-value-51']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-option[@id='mat-option-103']/span[contains(text(), 'Set status')]")).click();
		
	}

	
	@After
	public void tearDown() throws Exception {
		
		
	}


}

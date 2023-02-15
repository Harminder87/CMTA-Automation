package cmtaApplication;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreSitesPageManage {
	
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(), 'Close')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-0"));
		driver.findElement(By.id("mat-input-0")).sendKeys("admin");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
	    driver.findElement(By.id("mat-input-1")).sendKeys("H=E_f?rnyk=wm29P");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(), 'Login')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@href='/sites']/span[contains(text(), 'Sites')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span/mat-icon[contains(text(), 'settings')])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div/input[@role='combobox'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//mat-icon[contains(text(), 'add')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(), 'To site list')]")).click();
		
	}
	
	@After
	public void tearDown() throws Exception {
		
		
		
	}


}

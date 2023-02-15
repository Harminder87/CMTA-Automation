package cmtaApplication;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MediaListAcceptButton {
	
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
		driver.findElement(By.id("mat-input-0")).sendKeys("harminder.bedi@datavid.co.uk");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
	    driver.findElement(By.id("mat-input-1")).sendKeys("Bravo@123!");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(), 'Login')]")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/media-list']/span[contains(text(), 'Media List')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/media-list/527']/span[contains(text(), 'View')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a/span[contains(text(), 'Accept')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/textarea[@name='comments']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/textarea[@name='comments']")).sendKeys("Done");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button/span[contains(text(), 'Cancel')])")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button/span[contains(text(), 'Leave Without Submit')])")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//label/span)[1]")).click();
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		
		
	}

}

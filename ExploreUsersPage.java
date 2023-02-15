package cmtaApplication;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreUsersPage {
	
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
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[@href='/users']/span[contains(text(), 'Users')]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@data-placeholder='Search by  Name, Email']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@data-placeholder='Search by  Name, Email']")).sendKeys("harminder");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(), 'search')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(), 'close')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(), 'add')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@formcontrolname='name']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("HSB");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@formcontrolname='email']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("harminder.bedi@datavid.co.uk");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@formcontrolname='phone']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@formcontrolname='phone']")).sendKeys("+447733445522");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//mat-option[@role='option']/span[contains(text(), 'Submitter')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("Malaysia");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(), 'Malaysia')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//mat-select[@role='combobox'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//mat-option[@role='option']/span[contains(text(), 'For Upload')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//mat-select[@role='combobox'])[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//mat-option[@role='option']/span[contains(text(), 'Enabled')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div/button[@type='submit']/span[contains(text(), 'Submit')]")).click();
			
	        
		}
		


	@After
	public void tearDown() throws Exception {
		
		
		
	}
	


	

}

package cmtaApplication;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternalUserAzureLogin {
	
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
		driver.findElement(By.xpath("//span[contains(text(), 'Accept cookies')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-0"));
		driver.findElement(By.id("mat-input-0")).sendKeys("harminder.bedi@smith-nephew.co.uk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
		String URLtoNavigate = "https://cmta-dev.auth.us-east-2.amazoncognito.com/login?response_type=token&response_mode=query&client_id=3u5ub5b1cm4cu918jb823t1rce&redirect_uri=https://dev.clinical-transfer.smith-nephew.com/auth/oauth2/idpresponse?data=";
		driver.navigate().to(URLtoNavigate);
		driver.findElement(By.xpath("//input[@value='Azure'][1]")).click();
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
	}

	
	

}

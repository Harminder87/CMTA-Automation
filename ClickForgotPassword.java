package cmtaApplication;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickForgotPassword {
	
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
	public void test() {
		
		driver.get(baseURL);
		driver.findElement(By.xpath("//span[contains(text(), 'Accept cookies')]")).click();
		driver.findElement(By.xpath("//a[@href='/auth/forgotPassword']")).click();
		
	}


	@After
	public void tearDown() throws Exception {
		//Thread.sleep(5000);
		//driver.quit();
	}
}


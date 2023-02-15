package cmtaApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CmtaLoginPage {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", 
				//"/Users/harminder/Desktop/udemylearning/automationdrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://dev.clinical-transfer.smith-nephew.com/auth";
		driver.get(baseURL);

	}

}

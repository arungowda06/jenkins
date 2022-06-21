package mavenpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class basetest {
	WebDriver driver;
	@BeforeClass
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver","./src/main/resources/softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		}
	@AfterClass
	public void closebrowser(){
		driver.close();
	}
	
} 


package mavenpractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingTest {
	@Test
	public static void login(String email,String pwd){

	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com");
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@class='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();

}
}

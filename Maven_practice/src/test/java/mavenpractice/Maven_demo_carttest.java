package mavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Maven_demo_carttest extends basetest {
	//WebDriver driver;
	@Test
public void browser(){
	/*System.setProperty("webdriver.chrome.driver","./src/main/resources/softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");*/
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("ambulgiabhi@gmail.com");
	driver.findElement(By.xpath("//input[@class='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.findElement(By.xpath("(//a[@href='/books'])[3]")).click();
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	WebElement cart=driver.findElement(By.xpath("//a[@class='product-name']"));
	if(cart.isDisplayed()){
		System.out.println("PAss");
	}
	else{
		System.out.println("FAIL");
	}
		driver.findElement(By.className("ico-logout")).click();
}
}


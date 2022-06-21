package mavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Maven_demo_wishlistest extends basetest {
	//WebDriver driver;
	@Test
public void browserr(){
	/*System.setProperty("webdriver.chrome.driver","./src/main/resources/softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");*/
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("ambulgiabhi@gmail.com");
	driver.findElement(By.xpath("//input[@class='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.findElement(By.xpath("(//a[@href='/books'])[3]")).click();
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	driver.findElement(By.xpath("(//a[contains(text(),'Health Book')])[1]")).click();
	driver.findElement(By.id("add-to-wishlist-button-22")).click();
	driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
	if(driver.findElement(By.xpath("//a[text()='Health Book']")).isDisplayed()){
		System.out.println("TESTCASE PASS");
	}
	else{
		System.out.println("TESTCASE FAIL");
	}
	
	
}
}

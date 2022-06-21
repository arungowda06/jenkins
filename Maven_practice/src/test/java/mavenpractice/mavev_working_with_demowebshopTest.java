package mavenpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mavev_working_with_demowebshopTest extends basetest {
@Test
public void demo(){
	String firstname="rohit123";
	String lastname="sharma";
	String email="rohit264200o219@gmail.com";
	String pwd="264264";
	System.setProperty("webdriver.chrome.driver","./src/main/resources/softwares/chromedriver.exe");
	/*WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com");*/
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.xpath("//input[@value='M']")).click();
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstname);
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastname);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	driver.findElement(By.xpath("(//a[@href='/books'])[3]")).click();
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	WebElement cart=driver.findElement(By.xpath("//a[@class='product-name']"));
	if(cart.isDisplayed()){
		System.out.println("PAss");
	}
	else{
		System.out.println("Fail");
	}
	driver.findElement(By.className("ico-logout")).click();
	
	
}
}

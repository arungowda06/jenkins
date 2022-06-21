package mavenpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchbrowserTest {
@Test
public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver","./src/main/resources/softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
}
}

package getir.SeleniumCaseStudy;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestCase1 {
	static WebDriver driver;

	@BeforeClass
	public static void testsetup () throws MalformedURLException  {
	try {
	System.setProperty("webdriver.gecko.driver","C:\\Selenium\\drivers\\firefox\\geckodriver.exe"); 
	  	driver = new FirefoxDriver();
	  	driver.get("https://getir.com/yemek/");
	  	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	} catch (Exception e) {
		 e.printStackTrace();
		  }	 
	}
	
	@Test
	public void testcase1 () throws InterruptedException, MalformedURLException {
	
		driver.findElement(By.name("gsm")).sendKeys("5383084773");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//Thread.sleep(30000);
		Thread.sleep(1000);
		driver.switchTo().alert();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("1234");
	}


}

package getir.SeleniumCaseStudy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestCase2 {
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
	
		driver.findElement(By.cssSelector("div[role='combobox']")).click();
		//Thread.sleep(30000);
		
		System.out.println("App is opened..1");
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Yenişehir Mah., Pendik");
		/*
		System.out.println("App is opened..1");
		driver.switchTo().alert().sendKeys("Text");
		System.out.println("App is opened..2");
		
		
		*/
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type='text']")).clear();
		System.out.println("App is opened.3.3");
		
		System.out.println("App is opened..3");
		
		Set <String> handles =driver.getWindowHandles();
	    Iterator<String> it = handles.iterator();
	    System.out.println("App is opened..4");
	    String parent = it.next();
	    String child = it.next();
	    
	    driver.switchTo().window(child);
	    driver.findElement(By.cssSelector("span class[data-testid='text']")).click();
		System.out.println("App is opened..6");
	    //perform actions on child window
	    //perform actions on child window

	    driver.close(); // only for child wondow

		System.out.println("App is opened..5");
		
		
	}

	
}

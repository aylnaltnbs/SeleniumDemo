package getir.SeleniumCaseStudy;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.remote.BrowserType.FIREFOX;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class AppTest {
	static WebDriver driver;
	static String url= "http://demo.automationtesting.in/Index.html";
	String firstName= "Aylin";
	String lastName= "Altinbas";
	String adress= "Istanbul/Turkey";
	String email= "info@test.com.tr";
	String tel= "2161234567";
	String parola= "A!1qf2wf3ef4rf..";
	String parolaConfirm= "A!1qf2wf3ef4rf..";

	@BeforeClass
	public static void testsetup () throws MalformedURLException  {
	try {
	System.setProperty("webdriver.gecko.driver","C:\\Selenium\\drivers\\firefox\\geckodriver.exe"); 
	  	driver = new FirefoxDriver();
	  	driver.get(url);
	  	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	} catch (Exception e) {
		 e.printStackTrace();
		  }	 
	}
	
	@Test
	public void testcase1 () throws InterruptedException, MalformedURLException {
		/*
	 	System.setProperty("webdriver.gecko.driver","C:\\Selenium\\drivers\\firefox\\geckodriver.exe"); 
	  	WebDriver driver = new FirefoxDriver();
	  	driver.get(url);
		/*
	 	DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(FIREFOX);
        
        WebDriver driver = null;
		
			driver = new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"), cap);
			
			driver.manage().window().maximize();
			driver.get(url);
		
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			*/
			
		
		driver.findElement(By.id("btn2")).click();
	  	Thread.sleep(3000);
	  	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);;
	  	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
	  	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(adress);		
	  	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
	  	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(tel);  	
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("checkbox1")).click();	
        
        WebElement SelectSkills =  driver.findElement(By.id("Skills"));
		Select dropdownSkills= new Select(SelectSkills);
		dropdownSkills.selectByIndex(5);
		Thread.sleep(3000);
		
	
		driver.quit();  
	}

}

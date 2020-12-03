package jUnitPack;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class register {
	WebDriver driver = null;
	 
	@Test
	public void setup () throws InterruptedException {
		String url= "http://demo.automationtesting.in/Index.html";
		String firstName= "Aylin";
		String lastName= "Altinbas";
		String adress= "Istanbul/Turkey";
		String email= "info@test.com.tr";
		String tel= "2161234567";
		String parola= "A!1qf2wf3ef4rf..";
		String parolaConfirm= "A!1qf2wf3ef4rf..";	
		
	  	System.setProperty("webdriver.gecko.driver","C:\\Users\\Aylin\\Desktop\\geckodriver.exe"); 
	  	WebDriver driver = new FirefoxDriver();
	  	driver.get(url);
	  	driver.manage().window().maximize();
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
		
		WebElement SelectCountries =  driver.findElement(By.id("countries"));
		Select dropdownCountries= new Select(SelectCountries);
		dropdownCountries.selectByIndex(3);
		Thread.sleep(1000);
	
		WebElement SelectYear =  driver.findElement(By.id("yearbox"));
		Select dropdownYear= new Select(SelectYear);
		dropdownYear.selectByIndex(53);
		Thread.sleep(1000);
		
		WebElement SelectMonth = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select dropdownMonth= new Select(SelectMonth);
		dropdownMonth.selectByIndex(2);
		Thread.sleep(1000);
		
		WebElement SelectDay =  driver.findElement(By.id("daybox"));
		Select dropdownDay= new Select(SelectDay);
		dropdownDay.selectByIndex(3);
		Thread.sleep(1000);
		
		driver.findElement(By.id("firstpassword")).sendKeys(parola);
		driver.findElement(By.id("secondpassword")).sendKeys(parolaConfirm);
		Thread.sleep(1000);
		driver.findElement(By.id("submitbtn")).click();	
		Thread.sleep(5000);
		
		driver.quit();  
	}

}

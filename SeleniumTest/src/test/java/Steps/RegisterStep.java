package Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
public class RegisterStep {
 
    WebDriver driver;
 
    @Given("^Start Driver and Browser$")
    public void start_Driver_And_Browser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\drivers\\firefox\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
 
    @When("^Navigate To testkalite URL$")
    public void navigate_To_testkalite_URL() {
        driver.get("http://testkalite.com/");
    }
 
    @And("^Iletısım menu click$")
    public void iletisim_Menu_Click() {
        driver.findElement(By.cssSelector("#menu-ust-menuler-1 [href='http://testkalite.com/iletisim/']")).click();
    }
 
    @And("^Iletısım Form Filling$")
    public void iletisim_Form_Filling() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("vfb-5")));
 
        driver.findElement(By.name("vfb-5")).sendKeys("enes");
        driver.findElement(By.name("vfb-7")).sendKeys("cucumber");
        driver.findElement(By.name("vfb-8")).sendKeys("Cucumber örnek içerik");
        driver.findElement(By.name("vfb-10")).sendKeys("cucumber@cucumber.com");
        driver.findElement(By.name("vfb-3")).sendKeys("12");
    }
 
    @And("^Gönder Button Click$")
    public void gönder_Button_Click() {
        driver.findElement(By.name("vfb-submit")).click();
    }
 
    @Then("^Form Success message check$")
    public void form_Success_message_check() {
        Assert.assertEquals(driver.findElement(By.id("form_success")).getText(), "FORMUNUZ BAŞARIYLA GÖNDERILDI. BIZIMLE ILETIŞIME GEÇTIĞINIZ IÇIN TEŞEKKÜRLER. EN YAKIN ZAMANDA SIZE GERI DÖNÜŞ YAPACAĞIZ.");
        driver.quit();
    }
 
}
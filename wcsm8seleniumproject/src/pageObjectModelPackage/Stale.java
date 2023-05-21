package pageObjectModelPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Stale {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	ChromeOptions co =new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-0sl14kq/login.do");
	
	WebElement usernameTB = driver.findElement(By.name("username"));
	usernameTB.sendKeys("admin");

	WebElement passwordTB = driver.findElement(By.name("pwd"));
	passwordTB.sendKeys("manager");
	//WebElement button = driver.findElement(By.id("loginButton"));
    //button.click();
    
	driver.navigate().refresh();
	
    
    usernameTB.clear();
    Thread.sleep(2000);
    usernameTB.sendKeys("admin");
}
}

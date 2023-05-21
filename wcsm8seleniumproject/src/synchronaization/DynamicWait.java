package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicWait {
	
	// implictWait
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		// apply the implicitly wait to appear the webelement
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com");
	

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin@12345");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}
	}


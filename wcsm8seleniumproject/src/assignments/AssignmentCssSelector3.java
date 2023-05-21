package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentCssSelector3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			
			driver.get("https://www.netflix.com/in/Login");
			Thread.sleep(2000);
			driver.findElement(By.name("userLoginId")).sendKeys("abc@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("asdfgh");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[class*='n ']")).click();


	}

}

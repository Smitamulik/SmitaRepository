package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentCssSelector5 {
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/login");
		Thread.sleep(2000);
		driver.findElement(By.name("session_key")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("session_password")).sendKeys("asdfgh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='btn_']")).click();

	}
}

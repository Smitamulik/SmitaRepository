package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentLogin2 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("login_field")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("12345abc");
		driver.findElement(By.xpath("//button[text()='Signing in']")).click();

	}

}

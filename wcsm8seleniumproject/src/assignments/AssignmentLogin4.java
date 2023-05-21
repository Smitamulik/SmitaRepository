package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentLogin4 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");

				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");

				WebDriver driver=new ChromeDriver(co);
				driver.manage().window().maximize();
				
				driver.get("https://www.reddit.com/login/?dest=https%3A%2F%2Fwww.reddit.com%2F");
				Thread.sleep(2000);
				driver.findElement(By.id("loginUsername")).sendKeys("abcd@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.id("loginPassword")).sendKeys("12345abc");
				driver.findElement(By.xpath("//button[text()='LOG IN']")).click();

	}

}

package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TaskNo4 {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");

				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");

				WebDriver driver=new ChromeDriver(co);
				driver.manage().window().maximize();
				
				driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
				Thread.sleep(2000);
				driver.findElement(By.id("phoneNo")).sendKeys("8600599798");
			
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='button']")).click();
	}			

}

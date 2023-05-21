package task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartTask {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//handle of parent window
		String parentHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();
		//handle of parent and child window
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
				
				
			}
			else
			{
				
			}
		}
		String actualTitle = driver.getTitle();
		if(actualTitle.equals("Samsung S23 Ultra- Buy Products Online at Best Price in India - All Categories | Flipkart.com"));
		{
			System.out.println("Its Child Window");
		}
		else
		{
			System.out.println("Window is not handle");
		}
	
		
		}
	
		
		
}

package task;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneTask {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
		
		//switch the controls to frame for click on chatbox
		driver.switchTo().frame("fc_widget");//By using nameorID
		
		//driver.switchTo().frame(frameElement);//by using webelement as a frame
		driver.findElement(By.xpath("//div[@id='chat-icon']"));
		
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chatBox)).click();
		//switch the control to 
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("Smita_157");
		driver.findElement(By.id("chat-fc-email")).sendKeys("smitamulik@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("8698758665");
		
		
		
		
		
}
}
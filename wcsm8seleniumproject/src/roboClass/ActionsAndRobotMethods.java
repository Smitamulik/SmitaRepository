package roboClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndRobotMethods {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
	WebElement WatchJewellery= driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	Actions act = new Actions (driver);
	act.moveToElement(WatchJewellery).perform();
	driver.findElement(By.xpath("//a[text()='Band']")).click();
	WebElement filterBy = driver.findElement(By.xpath("//div[text()='Filter by']"));
	Thread.sleep(2000);
	for(int i=0;i<=2;i++)
	{
		act.clickAndHold(filterBy).perform();
		
	}
	//to copy filter by using robot class
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_P);
	
	driver.findElement(By.name("search_query")).click();
	
	//paste filter by
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	WebElement searchBoxButton = driver.findElement(By.name("submit_search"));
	searchBoxButton.click();
	}
}

package roboClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeyReleaseMethod {
	public static void main(String[] args) throws AWTException, InterruptedException {
		//System.setProperty("Webdriver.chrome.driver","./drivers/chromrdrivers.exe");
		
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		//	Open Browser
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter url of (ActiTime)
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//generate print popup we perform ctrl+p
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		
		//shift contro to cancel..........................
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		//Press enter to handle print popup
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		driver.quit();
			
	}
	}

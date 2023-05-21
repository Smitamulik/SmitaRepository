package screenshotpackage;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenshotWay1 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		//System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//consider  we are taking ss of selenium.dev wp
		driver.get("https://www.selenium.dev");
	
		//Implementation of method
				File src=driver.getScreenshotAs(OutputType.FILE);
				File dest=new File("./ScreenShots/way1.png");
				
				Files.copy(src, dest);
		
	}
}

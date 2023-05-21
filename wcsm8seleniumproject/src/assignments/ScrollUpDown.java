package assignments;



	import java.awt.AWTException;
	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	public class ScrollUpDown {

		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			//System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
			
			ChromeOptions co =new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.instagram.com");
			
			//to perform scrolling operation
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	Thread.sleep(2000);

	//scroll Up
	jse.executeScript("window.scrollBy(0,350)");
	Thread.sleep(2000);
	
	jse.executeScript("window.scrollBy(0,-350)");

	}
	}


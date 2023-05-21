package webBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		
				ChromeOptions co =new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				
				WebDriver driver=new ChromeDriver(co);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("file:///C:/Users/hp/Desktop/HTML/Confirmation.html");
				
				//generate alert popup
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				//handle alert
				Alert al = driver.switchTo().alert();
				Thread.sleep(2000);
				
				al.accept();
				String text = al.getText();
				System.out.println(text);
	}
	}


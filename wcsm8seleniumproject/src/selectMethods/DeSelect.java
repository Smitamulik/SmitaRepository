package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeSelect {
	
	// on Single select ....
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	    WebDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("file:///C:/Users/hp/Desktop/HTML/SingleSelectDropdown.html");
	    
	    // How to select the option 
	    
	    WebElement dropDown = driver.findElement(By.name("menu"));
	    
	    Select sel = new Select(dropDown);
	    
	    Thread.sleep(3000);
	    sel.selectByIndex(4);
	    
	    Thread.sleep(3000);
	    sel.deselectByIndex(4);
	    
	    
	    
	}

}
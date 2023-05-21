package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
		//tSystem.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/hp/Desktop/HTML/multiSelectDropdown.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDown);
		
		for(int i=3;i<6;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);	
	
		}
		Thread.sleep(2000);
		WebElement firstaOption=sel.getFirstSelectedOption();
		String value=firstaOption.getText();
		System.out.println(value);
	}
	

}

package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedMethod {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/hp/Desktop/HTML/multiSelectDropdown.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDown);
	WebElement Options = sel.getWrappedElement();
	String values = Options.getText();
	System.out.println(values);
		

}
}
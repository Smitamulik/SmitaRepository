package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSourceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	    WebDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.instagram.com/");
	    
	    String scode=driver.getPageSource();
	    System.out.println(scode);
	}

}

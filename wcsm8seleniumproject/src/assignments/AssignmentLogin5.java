package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentLogin5 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&id=264960&wreply=https%3a%2f%2fwww.bing.com%2fsecure%2fPassport.aspx%3fedge_suppress_profile_switch%3d1%26requrl%3dhttps%253a%252f%252fwww.bing.com%252f%253fwlexpsignin%253d1%26sig%3d1C216A86AAA5606204C07860AB5D614B&wp=MBI_SSL&lc=1033&CSRFToken=73960ada-aa28-4a53-93a2-a4ca7c2bc178&aadredir=1");
		Thread.sleep(2000);
		driver.findElement(By.id("i0116")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("idSIButton9")).sendKeys("12345abc");
		driver.findElement(By.xpath("//button[text()='idSIButton9']")).click();

	}

}

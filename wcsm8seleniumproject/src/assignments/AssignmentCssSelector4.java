package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentCssSelector4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.driver.chrome","./drivers/chromedriver.exe");

		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26hvadid%3D398134035836%26hvdev%3Dc%26hvlocphy%3D9062108%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D16079563329050725013%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_1971411%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("span[class*='a-button a-button-span12 a-button-p']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("abdtyaf");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class*='a-button']")).click();
		

	}

}

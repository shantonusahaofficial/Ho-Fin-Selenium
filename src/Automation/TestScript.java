package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author shantonu.saha
 *
 */
public class TestScript {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32");
		
		driver.get("https://piloterp.brac.net/node/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username_txt"));
		WebElement username=driver.findElement(By.id("username_txt"));
		driver.findElement(By.id("password"));
		WebElement password=driver.findElement(By.id("password"));
		username.sendKeys("00250179");
		password.sendKeys("abc123$");
		WebElement button = driver.findElement(By.cssSelector("button[type*='button']"));
		button.click();
		
		System.exit(0);	
		
		

	}

}

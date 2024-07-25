package QA_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {
	
	static WebDriver driver;

	public static void main(String[] args) {


		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	  JavascriptExecutor jse =	(JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,1200)");
		
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\shaik\\Downloads\\moin.jpeg");
		driver.close();
	}
	

}

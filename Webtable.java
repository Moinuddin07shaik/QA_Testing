package QA_Testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	  
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


	driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	
	System.out.println(GetRowColNum("Germany"));
}
public static boolean GetRowColNum(String name) {
	
	int Rowcount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	int Colcount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	
	System.out.println(Rowcount);
	System.out.println(Colcount);
	
	for(int i=1; i<Rowcount; i++) {
		for(int j=1; j<=Colcount; j++) {
		
		String actValue =	driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
		if(actValue.equals(name)) {
			System.out.println(i+" : "+j);
			break;
		}
		
		}
	}
	return true;
	
}

	}


	








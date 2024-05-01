import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IphonePrice {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//a[text()='Login']"));
		Actions act = new Actions(driver);
		act.doubleClick().perform();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone 15");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   // driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Starlight, 128 GB)']/parent::div/parent::div/child::div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']")).click();
       driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 15 Pro Max (White Titanium, 512 GB)')]/parent::div/parent::div/child::div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']")).click();
	    driver.quit();
	}

}

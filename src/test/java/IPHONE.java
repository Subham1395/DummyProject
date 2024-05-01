import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IPHONE {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	TakesScreenshot ss= (TakesScreenshot) driver;
	File src = ss.getScreenshotAs(OutputType.FILE);
	File trc = new File(".\\ScreenShot\\flipkart.png");
	FileUtils.copyFile(src, trc);
	Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='Login']"));
	Actions act = new Actions(driver);
	act.doubleClick().perform();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone 14");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']")).click();
	Set<String> allwind = driver.getWindowHandles();
	Iterator<String> it =allwind.iterator(); 
	  String parent = (String) it.next();
	 String child = (String) it.next();
	driver.switchTo().window(child);
	 driver.findElement(By.xpath("//button[@type='button']")).click();
	 driver.quit();
	
	}

}

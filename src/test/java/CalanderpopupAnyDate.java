import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalanderpopupAnyDate {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Thu Sep 28 2023']")).click();
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trc = new File(".\\ScreenShot\\calanderdate.png");
		FileUtils.copyFile(src, trc);
		//driver.quit();
	}

}

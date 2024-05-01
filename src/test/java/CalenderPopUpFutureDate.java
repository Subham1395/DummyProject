import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopUpFutureDate {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//div[@aria-label='Sat Dec 09 2023']")).click();
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				Thread.sleep(1000);			
				}
		}
		
		

	}

}

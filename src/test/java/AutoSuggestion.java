import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nokia");
		List<WebElement> allsuggesion = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		for(WebElement sug : allsuggesion)
		{
			System.out.println(sug.getText());
			
		}

	}

}

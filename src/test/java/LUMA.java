import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LUMA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver() ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://magento.softwaretestingboard.com/");
	driver.findElement(By.linkText("Sign In")).click();
	driver.findElement(By.name("login[username]")).sendKeys("vijay963@gmail.com");
	driver.findElement(By.name("login[password]")).sendKeys("Vijay123",Keys.ENTER);
//	driver.findElement(By.linkText("Create an Account")).click();
//	driver.findElement(By.id("firstname")).sendKeys("kuldeep");
//	driver.findElement(By.id("lastname")).sendKeys("singh");
//	driver.findElement(By.id("email_address")).sendKeys("kuldeep123@gmail.com");
//	
//	driver.findElement(By.id("password")).sendKeys("Kuldeep123");
//	driver.findElement(By.id("password-confirmation")).sendKeys("Kuldeep123",Keys.ENTER);
	}

}

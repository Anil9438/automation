package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	WebDriver driver;

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		ExplicitWait iw=new ExplicitWait();
		iw.setup();

	}
	
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
		
		
		WebElement enableAfter=wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
	    enableAfter.click();
	    System.out.println(enableAfter.getText());
		
	}

}

package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	WebDriver driver;

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		ImplicitWait iw=new ImplicitWait();
		iw.setup();

	}
	
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
		
	    WebElement visible_after=driver.findElement(By.id("visibleAfter"));
	    System.out.println(visible_after.getText());
		
	}

}

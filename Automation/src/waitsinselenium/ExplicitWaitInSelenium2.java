package waitsinselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitInSelenium2 {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExplicitWaitInSelenium2 sp=new ExplicitWaitInSelenium2();
		sp.setup();
	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
			
		
		WebElement btn_visibleafter=wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));
		
		System.out.println(btn_visibleafter.getText());
	
		
	}
}
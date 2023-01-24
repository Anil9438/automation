package waitsinselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitInSelenium {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExplicitWaitInSelenium sp=new ExplicitWaitInSelenium();
		sp.setup();
	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/mutual-funds/best-mutual-funds/mutual-fund-list/");
		
		WebElement btn_showlist=wait.until(ExpectedConditions.elementToBeClickable(By.id("go")));
		
		System.out.println(btn_showlist.getText());		

	}

}

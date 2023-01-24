package alertsinselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsInSeleniumTimePeriod {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		AlertsInSeleniumTimePeriod tp=new AlertsInSeleniumTimePeriod();
		tp.setup();		
	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		WebElement btn_timer=driver.findElement(By.id("timerAlertButton"));
		btn_timer.click();
		//Thread.sleep(7000);
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		System.out.println("On button click, alert will appear after 5 seconds: "+alert.getText());
		Thread.sleep(3000);
		alert.accept();		
		
	}

}

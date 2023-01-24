package alertsinselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsInSelenium {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		AlertsInSelenium a=new AlertsInSelenium();
		a.setup();
	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		WebElement btn_alert=driver.findElement(By.id("alertButton"));
		btn_alert.click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println("Click Button to see alert: "+alert.getText());
		Thread.sleep(3000);
		alert.accept();
		
		WebElement btn_confirm=driver.findElement(By.id("confirmButton"));
		btn_confirm.click();
		
		alert=driver.switchTo().alert();
		System.out.println("On button click, confirm box will appear: "+alert.getText());
		Thread.sleep(3000);
		alert.accept();		
		
		WebElement btn_promt=driver.findElement(By.id("promtButton"));
		Thread.sleep(3000);
		btn_promt.click();
		
		alert=driver.switchTo().alert();
		System.out.println("On button click, prompt box will appear: "+alert.getText());
		Thread.sleep(2000);
		alert.sendKeys("Anil Patil");
		alert.accept();				
	}

}

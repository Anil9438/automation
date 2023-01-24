package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Alerts alrt=new Alerts();
		alrt.setup();

	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		WebElement btn_alert=driver.findElement(By.name("alertbox"));
		Thread.sleep(3000);
		btn_alert.click();		
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		
		WebElement btn_confirmalert=driver.findElement(By.name("confirmalertbox"));
		Thread.sleep(3000);
		btn_confirmalert.click();		
		
		Alert alert_confirm=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert_confirm.getText());
		Thread.sleep(3000);
		alert_confirm.dismiss();
		
		WebElement btn_prompt=driver.findElement(By.name("promptalertbox1234"));
		Thread.sleep(3000);
		btn_prompt.click();		
		
		Alert alert_prompt=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert_prompt.getText());
		Thread.sleep(3000);
		alert_prompt.accept();		
		
		
	}

}

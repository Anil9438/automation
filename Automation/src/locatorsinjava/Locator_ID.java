package locatorsinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ID {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Locator_ID dp=new Locator_ID();
		dp.steup();	
	}
	
	public void steup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement s=driver.findElement(By.id("email"));
		s.sendKeys("anilpatil9438@gmail.com");
		
		WebElement p=driver.findElement(By.id("pass"));
		p.sendKeys("Test@123");
		
		WebElement k=driver.findElement(By.name("login"));
		k.click();	
		
		Thread.sleep(4000);
		driver.close();
		
	}

}

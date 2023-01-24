package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SelectClass s=new SelectClass();
		s.setup();

	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/mutual-funds/best-mutual-funds/mutual-fund-list/");
		
		WebElement select=driver.findElement(By.id("amcName"));
		Select sp=new Select(select);
		Thread.sleep(3000);
		sp.selectByIndex(4);	
		Thread.sleep(3000);
		//driver.findElement(By.name("go")).submit();
		
		WebElement sel_value=driver.findElement(By.id("amcName"));
		Select value=new Select(sel_value);
		value.selectByValue("400005");
		Thread.sleep(3000);
		
		WebElement sel_visibleText=driver.findElement(By.id("amcName"));
		Select visibleText=new Select(sel_visibleText);
		visibleText.selectByVisibleText("HDFC Mutual Fund");
		
		
		
	}

}

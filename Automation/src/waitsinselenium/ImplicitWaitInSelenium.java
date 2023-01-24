package waitsinselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitInSelenium {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ImplicitWaitInSelenium sp=new ImplicitWaitInSelenium();
		sp.setup();
	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/mutual-funds/best-mutual-funds/mutual-fund-list/");
		
		WebElement select_tag=driver.findElement(By.id("amcName"));
		
		Select s=new Select(select_tag);
		Thread.sleep(3000);
		s.selectByIndex(5);
		
		Thread.sleep(3000);
		s.selectByValue("400040");
		
		Thread.sleep(3000);
		s.selectByVisibleText("HDFC Mutual Fund");
	}

}

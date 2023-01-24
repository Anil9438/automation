package navigationmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		NavigationMethod dp=new NavigationMethod();
		dp.setup();

	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		search.sendKeys("book");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);		
		driver.navigate().to("https://www.moneyworks4me.com/");
		
	}

}

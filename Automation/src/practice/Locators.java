package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Locators f=new Locators();
		f.setup();
	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/index/need-help/");
		
		//Finding Element By ID	
		driver.findElement(By.id("Radio_1")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("name_f")).sendKeys("Anil");
		Thread.sleep(3000);
		
		//Finding Element By Name
		driver.findElement(By.name("Name_Last")).sendKeys("Patil");
		Thread.sleep(3000);
		
		//Finding Element By ID
		driver.findElement(By.id("emailid")).sendKeys("test@test.com");
		Thread.sleep(3000);
		
		//Finding Element By Name
		driver.findElement(By.name("PhoneNumber_countrycode")).sendKeys("9595881316");
		Thread.sleep(3000);
		
		/*//Finding Element By ID (Don't submit button form will submit)
		driver.findElement(By.id("submit")).submit();
		Thread.sleep(3000);*/
		
		//Finding Element By Link Text
		WebElement p=driver.findElement(By.linkText("INA000013323"));
		System.out.println(p.getText());
		System.out.println(p.getAttribute("href"));
		Thread.sleep(3000);
		
		//Finding Element By Partial Link Text
		WebElement s=driver.findElement(By.partialLinkText("Subscribe to Alpha"));
		System.out.println(s.getText());
		System.out.println(s.getAttribute("href"));
		Thread.sleep(3000);
		
		//Finding Element By Tag Name
		List<WebElement> sp=driver.findElements(By.tagName("a"));
		System.out.println("Count:"+ sp.size());
		/*for (WebElement x:sp)
		{
			System.out.println(x.getText()+":"+x.getAttribute("href"));
		}*/
		Thread.sleep(3000);
		
		//Finding Element By X-path
		WebElement ap=driver.findElement(By.xpath("//a[contains(text(),'Download APP')]"));
		System.out.println(ap.getAttribute("href"));
		
		//Finding Element By X-path
		WebElement kp=driver.findElement(By.xpath("//section[2]/div/div/div/div"));
		System.out.println(kp.getText());
		
	}

}

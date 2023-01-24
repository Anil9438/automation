package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTabs {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WindowTabs wt=new WindowTabs();
		wt.window();

	}
	
	public void window() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		String main_window=driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> all_window=driver.getWindowHandles();
		
		for(String x:all_window)
		{
			if (!x.equals(main_window))
			{
				driver.switchTo().window(x);
				WebElement y=driver.findElement(By.id("sampleHeading"));
				System.out.println(y.getText());
				Thread.sleep(3000);
				driver.quit();
			}
		}
		
		
	}

}

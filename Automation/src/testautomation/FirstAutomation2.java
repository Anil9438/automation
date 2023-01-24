package testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutomation2 {
	
	WebDriver driver_chrome;
	WebDriver driver_edge;
	WebDriver driver_firefox;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstAutomation2 s=new FirstAutomation2();
		s.firstTest_Chrome();
		s.firstTest_Edge();
		//s.firstTest_Firefox();  // Getting Error while execution

	}
	
	public void firstTest_Chrome()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver_chrome=new ChromeDriver();
		driver_chrome.manage().window().minimize();
		driver_chrome.get("https://www.facebook.com/");
		//driver_chrome.close();
		
	}
	
	public void firstTest_Edge()
	{
		System.setProperty("webdriver.edge.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\edgedriver_win64\\msedgedriver.exe");
		driver_edge=new EdgeDriver();
		driver_edge.manage().window().minimize();
		driver_edge.get("https://www.amazon.in/");
		//Edge_driver.close();
		
	}
	
	public void firstTest_Firefox()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		driver_firefox=new FirefoxDriver();
		driver_firefox.manage().window().maximize();
		driver_firefox.get("https://www.flipkart.com/");
		//driver_firefox.close();
		
	}

}

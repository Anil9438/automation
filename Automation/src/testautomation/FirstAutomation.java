package testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {
	
	WebDriver driver_chrome;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirstAutomation s=new FirstAutomation();
		s.firstTest_Chrome();

	}
	
	public void firstTest_Chrome() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver_chrome=new ChromeDriver();
		driver_chrome.manage().window().maximize();
		driver_chrome.get("https://www.facebook.com/");
		Thread.sleep(3000);  //it closes window after 3sec
		driver_chrome.close();
		
	}
	
}

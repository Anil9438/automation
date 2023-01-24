package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FileUpload fu=new FileUpload();
		fu.fileUpload();

	}
	
	public void fileUpload() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload");
		
		driver.findElement(By.name("uploadfile_0")).sendKeys("D:\\Software Testing\\DCTC\\Automation\\Selenium\\selenium methods.txt");
		Thread.sleep(3000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("submitbutton")).click();
	}

}

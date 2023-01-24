package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectGuruBank {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProjectGuruBank bank=new ProjectGuruBank();
		bank.newCustomer();

	}
	
	public void newCustomer()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/manager/Managerhomepage.php");
		
		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
	}

}

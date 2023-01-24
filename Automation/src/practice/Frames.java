package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Frames f=new Frames();
		f.setup();
	}
	
	public void setup() throws InterruptedException
	{
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		
		WebElement f=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(f);
		
		driver.findElement(By.id("fname")).sendKeys("Anil");
		Thread.sleep(3000);
		driver.findElement(By.id("lname")).sendKeys("Patil");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		driver.switchTo().defaultContent();
		
	}

}

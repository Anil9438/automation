package framesinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrame {
	
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		TestFrame tf=new TestFrame();
		tf.setup();		

	}
	
	public void setup() throws InterruptedException
	{
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
		//System.out.println(actual_path);
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		
		WebElement frame1=driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.id("fname")).sendKeys("Anil");
		driver.findElement(By.id("lname")).sendKeys("Patil");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		driver.switchTo().defaultContent();
	}

}

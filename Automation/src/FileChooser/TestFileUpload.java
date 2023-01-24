package FileChooser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFileUpload {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		TestFileUpload tf=new TestFileUpload();
		tf.setup();

	}
	
	public void setup() throws InterruptedException
	{
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("D:\\Software Testing\\DCTC\\burndown and up chart.PNG");
		Thread.sleep(3000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("submitbutton")).click();		
		
	}

}

package robotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.StringSelection;

public class RobotInSelenium {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		RobotInSelenium robo=new RobotInSelenium();
		robo.setup();
	}
	
	public void setup() throws InterruptedException, AWTException
	{
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		
		WebElement choose_file=driver.findElement(By.id("uploadfile_0"));		
		Actions a=new Actions(driver);
		a.moveToElement(choose_file).click().build().perform();
		
		Thread.sleep(3000);
		
		String file_path="D:\\Software Testing\\DCTC\\burndown and up chart.PNG";
		StringSelection str=new StringSelection(file_path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("submitbutton")).click();		
		
	}

}

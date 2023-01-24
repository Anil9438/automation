package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		CheckBox cb=new CheckBox();
		cb.setup();
	}
	
	public void setup() throws InterruptedException
	{
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/mutual-funds/best-mutual-funds/mutual-fund-list");
		Thread.sleep(3000);
		driver.findElement(By.id("chk+33369+sbi-nifty-50-etf")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("chk+20447+sbi-s&p-bse-sensex-etf")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("chk+33150+uti-nifty-50-etf")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("chk+7874+kotak-flexicap-fund")).click();
		
	}

}

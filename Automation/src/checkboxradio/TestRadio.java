package checkboxradio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadio {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		TestRadio dp=new TestRadio();
		dp.setup();
	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/stock-market/stock-screener");
		
		WebElement radio_nifty50=driver.findElement(By.xpath("//input[@id='best-from-nifty-50']"));
		Thread.sleep(3000);
		System.out.println("Best from Nifty 50 is Enabled or not: "+radio_nifty50.isEnabled());
		//check_radio.click();
		//System.out.println("Best from Nifty 50 is Selected or not: "+check_radio.isSelected());
		
		WebElement radio_nifty100=driver.findElement(By.xpath("//input[@id='best-from-nifty-100']"));
		Thread.sleep(3000);
		System.out.println("Best from Nifty 100 is Enabled or not: "+radio_nifty100.isEnabled());
	}

}

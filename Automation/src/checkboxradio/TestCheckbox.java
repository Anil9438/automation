package checkboxradio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckbox {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		TestCheckbox sp=new TestCheckbox();
		sp.setup();

	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/best-index/nse-stocks/top-nifty50-companies-list/");
		//Thread.sleep(3000);
		
		WebElement check_eicher=driver.findElement(By.xpath("//input[@value='105200']"));
		System.out.println("Eicher Motors Value: "+check_eicher.getAttribute("value"));
		Thread.sleep(3000);
		System.out.println("Eicher Motors Enabled or not: "+check_eicher.isEnabled());
		check_eicher.click();
		System.out.println("Eicher Motors Selected or not: "+check_eicher.isSelected());
		
		WebElement check_airtel=driver.findElement(By.xpath("//input[@value='132454']"));
		System.out.println("Bharati Airtel Value: "+check_eicher.getAttribute("value"));
		Thread.sleep(3000);
		System.out.println("Bharati Airtel is Enabled or not:  "+check_airtel.isEnabled());
		check_airtel.click();
		System.out.println("Bharati Airtel is Selected or not:  "+check_airtel.isSelected());
		
		Thread.sleep(3000);
		check_eicher.click();
		Thread.sleep(3000);
		check_airtel.click();		
		
	}

}

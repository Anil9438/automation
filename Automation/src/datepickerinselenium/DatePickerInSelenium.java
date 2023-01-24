package datepickerinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerInSelenium {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DatePickerInSelenium dp=new DatePickerInSelenium();
		dp.datePicker();
	}
	
	public void datePicker() throws InterruptedException
	{
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/index/need-help/");
		
		driver.findElement(By.xpath("//form/div[2]/div/div[1]/div[1]/div[2]/div[5]/div/div/span")).click();
		Thread.sleep(3000);
		
		WebElement sel_hr=driver.findElement(By.id("DateTime_hours"));
		Select hr=new Select(sel_hr);
		hr.selectByVisibleText("18");
		Thread.sleep(3000);
		
		WebElement sel_min=driver.findElement(By.id("DateTime_minutes"));
		Select min=new Select(sel_min);
		min.selectByVisibleText("30");
		Thread.sleep(3000);
		
		
		
	}

}

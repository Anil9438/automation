package datepickerinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerInSelenium2 {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DatePickerInSelenium2 dp=new DatePickerInSelenium2();
		dp.datePicker();
	}
	
	public void datePicker() throws InterruptedException
	{
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		
		/*driver.findElement(By.id("datePickerMonthYearInput")).click();
		Thread.sleep(3000);
		
		WebElement sel_month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select month=new Select(sel_month);
		month.selectByVisibleText("May");
		Thread.sleep(3000);
		
		WebElement sel_year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select year=new Select(sel_year);
		year.selectByValue("1985");
		Thread.sleep(3000);
		
		WebElement sel_day=driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, May 5th, 1985']"));
		sel_day.click();
		Thread.sleep(3000);*/
		
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("react-datepicker__year-read-view--down-arrow")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='react-datepicker']/div/div/div/div/div/div[10]")).click();
		Thread.sleep(3000);
		
		/*driver.findElement(By.xpath("//div/span[@class='react-datepicker__month-read-view--down-arrow']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']/div[1]/div/div/div/div[5]")).click();
		Thread.sleep(3000);*/
		
	}

}

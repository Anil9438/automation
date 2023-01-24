package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInSelenium {
	
	WebDriver driver;

	public static void main(String[] args) {
		
		WebTableInSelenium dp=new WebTableInSelenium();
		dp.setup();
	}
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/best-index/nse-stocks/top-nifty50-companies-list/");
		
		List<WebElement> table_data=driver.findElements(By.xpath("//table[@id='stock-list-table']/tbody/tr"));
		//List<WebElement> table_data=driver.findElements(By.id("stock-list-table"));
		for(WebElement x:table_data) 
		{
			String company_name= x.findElement(By.xpath("td[2]/div/div")).getText();
			String cmp= x.findElement(By.xpath("td[3]")).getText();
			String price_change= x.findElement(By.xpath("td[4]")).getText();
			String market_cap= x.findElement(By.xpath("td[5]")).getText();
			
			System.out.println(company_name+" "+cmp+" "+price_change+" "+market_cap);
		}
		
	}

}

package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebTable wt=new WebTable();
		wt.setup();
	}
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/best-index/top-stocks/top-small-cap-companies-list/");
		
		List<WebElement> table=driver.findElements(By.xpath("//table[@class='table list-table table-responsive-lg w-100 mb-3 responsive-holder']/tbody/tr"));
		
		for (WebElement x:table)
		{
			String stock=x.findElement(By.xpath("td[2]")).getText();
			String cmp=x.findElement(By.xpath("td[4]")).getText();
			String pricechange=x.findElement(By.xpath("td[5]")).getText();
			String marketcap=x.findElement(By.xpath("td[6]")).getText();
			
			System.out.println(stock+" "+cmp+" "+pricechange+" "+marketcap);
		}
	}

}

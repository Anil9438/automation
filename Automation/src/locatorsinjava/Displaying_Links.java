package locatorsinjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displaying_Links {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Displaying_Links dl=new Displaying_Links();
		dl.setup();
	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/");
		
		List<WebElement> a_tag = driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
		System.out.println("Count :"+a_tag.size());
		
		for(WebElement s:a_tag)
		{
			System.out.println(s.getText()+" : "+s.getAttribute("href"));
		}
	}
}



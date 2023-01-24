package locatorsinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Text {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locator_Text sp=new Locator_Text();
		sp.setup();

	}
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/");
		
		WebElement p_text=driver.findElement(By.xpath("//p[contains(text(),'5-Step Journey')]"));
		System.out.println(p_text.getText());
		
		WebElement text_StartsWith=driver.findElement(By.xpath("//p[starts-with(text(),'And one more')]"));
		System.out.println(text_StartsWith.getText());
	}

}

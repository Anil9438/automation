package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		RadioButton rb=new RadioButton();
		rb.setup();
	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/index/need-help/");
		
		WebElement radio_1=driver.findElement(By.id("Radio_1"));
		System.out.println("Radio_1 is Enabled:"+radio_1.isEnabled());
		Thread.sleep(3000);
		radio_1.click();
		System.out.println("Radio_1 is Selected:"+radio_1.isSelected());
		
		WebElement radio_2=driver.findElement(By.id("Radio_2"));
		System.out.println("Radio_2 is Enabled:"+radio_2.isEnabled());
		Thread.sleep(3000);
		radio_2.click();
		System.out.println("Radio_2 is Selected:"+radio_2.isSelected());
		System.out.println("Radio_1 is Selected:"+radio_1.isSelected());
		
		WebElement radio_3=driver.findElement(By.id("Radio_3"));
		System.out.println("Radio_3 is Enabled:"+radio_3.isEnabled());
		Thread.sleep(3000);
		radio_3.click();
		System.out.println("Radio_3 is Selected:"+radio_3.isSelected());
		System.out.println("Radio_2 is Selected:"+radio_2.isSelected());
		System.out.println("Radio_1 is Selected:"+radio_1.isSelected());
		
	}

}

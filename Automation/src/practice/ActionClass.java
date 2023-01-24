package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ActionClass ac=new ActionClass();
		ac.setup();

	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		WebElement left_click=driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		System.out.println(left_click.getText());
		a.moveToElement(left_click).click().build().perform();
		
		WebElement click_text=driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
		System.out.println(click_text.getText());
		
		WebElement right_click=driver.findElement(By.id("rightClickBtn"));
		Thread.sleep(3000);
		System.out.println(right_click.getText());
		a.moveToElement(right_click).contextClick().perform();
		
		WebElement double_click=driver.findElement(By.id("doubleClickBtn"));
		Thread.sleep(3000);
		System.out.println(double_click.getText());
		a.moveToElement(double_click).doubleClick().perform();
	}

}

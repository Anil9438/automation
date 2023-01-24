package actionsclassinselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	WebDriver driver;
	String path;
	String actual_path;
	String properties_path;
	String base_url;
	Actions a;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		DragandDrop dnd=new DragandDrop();
		dnd.read_properties_file();
		dnd.setup();
		dnd.test_drag_and_drop();
	}
	
	public void read_properties_file() throws IOException
	{
		path=System.getProperty("user.dir");
		actual_path=path+"\\Driver\\chromedriver.exe";
		properties_path=path+"\\Driver\\Test.properties";
		
		//Read the File
		File f=new File(properties_path);
		FileInputStream fin=new FileInputStream(f);
		
		//Load the Properties File
		Properties p=new Properties();
		p.load(fin);		
		base_url=p.getProperty("url");
		
	}
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(base_url);
	}
	
	public void test_drag_and_drop() throws InterruptedException
	{
		WebElement btn_drag_bank=driver.findElement(By.id("credit2"));
		WebElement btn_drag_amount=driver.findElement(By.id("fourth"));
		WebElement btn_drag_sales=driver.findElement(By.id("credit1"));
		
		WebElement btn_drop_bank=driver.findElement(By.id("bank"));
		WebElement btn_drop_amount_credit=driver.findElement(By.id("amt8"));
		WebElement btn_drop_amount_debit=driver.findElement(By.id("amt7"));
		WebElement btn_drop_sales=driver.findElement(By.id("loan"));
		
		a=new Actions(driver);
		Thread.sleep(3000);
		a.dragAndDrop(btn_drag_bank, btn_drop_bank).build().perform();
		Thread.sleep(3000);
		a.dragAndDrop(btn_drag_amount, btn_drop_amount_debit).build().perform();
		Thread.sleep(3000);
		a.dragAndDrop(btn_drag_amount, btn_drop_amount_credit).build().perform();
		Thread.sleep(3000);
		a.dragAndDrop(btn_drag_sales, btn_drop_sales).build().perform();		
		
	}
}

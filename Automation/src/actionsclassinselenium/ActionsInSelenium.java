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

public class ActionsInSelenium {
	
	WebDriver driver;
	String path;
	String actual_path;
	String properties_path;
	String base_url;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		ActionsInSelenium sp=new ActionsInSelenium();
		sp.read_propeties_file();
		sp.setup();
		sp.test_action();

	}
	
	public void read_propeties_file() throws IOException
	{
		path=System.getProperty("user.dir");
		actual_path=path+"\\Driver\\chromedriver.exe";
		properties_path=path+"\\Driver\\Test.properties";
		
		//for reading file
		File f=new File(properties_path);
		FileInputStream fin=new FileInputStream(f);
		
		//for loading properties file
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
	
	public void test_action() throws InterruptedException
	{
		WebElement btn_single_click=driver.findElement(By.xpath("//button[starts-with (text(),'Click Me')]"));
		Actions a=new Actions(driver);
		a.moveToElement(btn_single_click).click().build().perform();
		
		WebElement btn_double_click=driver.findElement(By.id("doubleClickBtn"));
		Thread.sleep(3000);
		a.moveToElement(btn_double_click).doubleClick().build().perform();
		
		WebElement btn_right_click=driver.findElement(By.id("rightClickBtn"));
		Thread.sleep(3000);
		a.moveToElement(btn_right_click).contextClick().build().perform();
		
	}
	

}

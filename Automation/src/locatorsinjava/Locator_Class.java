package locatorsinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Class{
	
	WebDriver driver;

 public static void main(String[] args) throws InterruptedException{

	Locator_Class s=new Locator_Class();
	s.classname_Locator();

}

public void classname_Locator() throws InterruptedException
{

	System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.moneyworks4me.com/login/");
	
	WebElement email=driver.findElement(By.id("emailid"));
	email.sendKeys("anil.patil@moneyworks4me.com");

	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("Anil@123");
	
	WebElement login_btn=driver.findElement(By.className("btn-block"));
	login_btn.click();
	
	//Selector by Tag Name
	
	WebElement a_tag=driver.findElement(By.tagName("a"));
	System.out.println("text: "+a_tag.getText());
	System.out.println("title: "+a_tag.getAttribute("title"));
	System.out.println("href url: "+a_tag.getAttribute("href"));
	a_tag.click();

}
}
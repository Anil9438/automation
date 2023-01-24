package locatorsinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Locator_Xpath s=new Locator_Xpath();
		s.setup();

	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/login/");
		//Thread.sleep(3000);
		//driver.close();

		WebElement email_xPathActual=driver.findElement(By.xpath("/html/body/section/div[2]/div/div/form/div/input"));
		System.out.println("Name: "+email_xPathActual.getAttribute("name"));
		System.out.println("Type: "+email_xPathActual.getAttribute("type"));
		//Thread.sleep(3000);
		email_xPathActual.sendKeys("anil.patil@moneyworks4me.com");
		
		WebElement pass_xPathActual=driver.findElement(By.xpath("/html/body/section/div[2]/div/div/form/div[2]/div/input"));
		System.out.println("Name: "+pass_xPathActual.getAttribute("name"));
		System.out.println("Type: "+pass_xPathActual.getAttribute("type"));
		pass_xPathActual.sendKeys("Anil@321");
		Thread.sleep(3000);
		
		email_xPathActual.clear();
		pass_xPathActual.clear();

		WebElement email_xPathRelative=driver.findElement(By.xpath("//input[@id='emailid']"));
		System.out.println("Name: "+email_xPathRelative.getAttribute("name"));
		System.out.println("Type: "+email_xPathRelative.getAttribute("type"));
		//Thread.sleep(3000);
		email_xPathRelative.sendKeys("anilpatil@gmail.com");
		
		WebElement pass_xPathRelative=driver.findElement(By.xpath("//input[@type='password']"));
		System.out.println("Name: "+pass_xPathRelative.getAttribute("name"));
		System.out.println("type: "+pass_xPathRelative.getAttribute("type"));
		//Thread.sleep(3000);
		pass_xPathRelative.sendKeys("Navya@123");
		
		pass_xPathRelative.clear();
		Thread.sleep(3000);
		
		WebElement xPath_Relative=driver.findElement(By.xpath("//input[@type='password' and @id='password']"));
		xPath_Relative.sendKeys("Kavya@123");
		
	}

}

package locatorsinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Links {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locator_Links p=new Locator_Links();
		p.setup();

	}
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\DCTC\\Automation\\Selenium\\Software Exe Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneyworks4me.com/");
		
		/*WebElement link=driver.findElement(By.linkText("Careers"));
		System.out.println("Link Text: "+link.getText());
		System.out.println("Link Title: "+link.getAttribute("title"));
		System.out.println("Link Href: "+link.getAttribute("href"));
		link.click();*/
		
		WebElement link_partial=driver.findElement(By.partialLinkText("Schedule"));
		System.out.println("Link Text: "+link_partial.getText());
		System.out.println("Link Title: "+link_partial.getAttribute("title"));
		System.out.println("Link Href: "+link_partial.getAttribute("href"));
		link_partial.click();
		
		WebElement partial_link=driver.findElement(By.partialLinkText("Register"));
		System.out.println("Link Text: "+partial_link.getText());
		System.out.println("Link Title: "+partial_link.getAttribute("title"));
		System.out.println("Link Href: "+partial_link.getAttribute("href"));
		partial_link.click();
		
	}

}

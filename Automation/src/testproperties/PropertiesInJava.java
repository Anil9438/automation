package testproperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesInJava {
	
	WebDriver driver;
	String path;
	String actual_path;
	String properties_path;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PropertiesInJava dp=new PropertiesInJava();
		dp.setup();

	}
	
	public void setup() throws IOException
	{
		path=System.getProperty("user.dir");
		actual_path=path+"\\Driver\\chromedriver.exe";
		properties_path=path+"\\Driver\\Test.properties";
		
		//For reading the Properties File
		File f=new File(properties_path);
		FileInputStream fin=new FileInputStream(f);
		
		//Loading File in Properties
		Properties p=new Properties();
		p.load(fin);
		
		String base_url=p.getProperty("url");
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.get(base_url);
		
		//For writing into the Properties File
		FileOutputStream fout=new FileOutputStream(f);
		p.setProperty("username", "anil.patil@moneyworks4me.com");
		p.setProperty("password", "Test@321");
		p.store(fout, "Adding username and password");
		
		
	}

}

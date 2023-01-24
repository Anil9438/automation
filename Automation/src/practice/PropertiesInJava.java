package practice;

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
	String base_url;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PropertiesInJava prop=new PropertiesInJava();
		prop.properties();

	}
	
	public void properties() throws IOException
	{
		path=System.getProperty("user.dir");
		actual_path=path+"\\Driver\\chromedriver.exe";
		properties_path=path+"\\Driver\\sample.properties";
		
		//Reading the file
		File f=new File(properties_path);
		FileInputStream fin=new FileInputStream(f);
		
		//loading Properties File		
		Properties p=new Properties();
		p.load(fin);
		
		base_url=p.getProperty("url");
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(base_url);
		
		//Write the File
		FileOutputStream fout=new FileOutputStream(f);
		p.setProperty("username", "Anil Patil");
		p.setProperty("password", "Anil@123");
		p.store(fout, "adding username and password");
		
	}
	
	

}

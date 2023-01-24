package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling3 {
	
	int a;
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		ExceptionHandling3 e3=new ExceptionHandling3();
		try {
			    e3.slowDown();
		    } 
		catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void slowDown() throws InterruptedException, FileNotFoundException
	{
		
		System.out.println("Hi");
		Thread.sleep(4000);
		
		System.out.println("Anil");
		Thread.sleep(4000);
		
		System.out.println("How");
		Thread.sleep(4000);
		
		System.out.println("are you?");
		Thread.sleep(4000);
		
		File f=new File("XYZ.Text");
		FileInputStream fin=new FileInputStream(f);
		
		
	}

}

package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
	
	int p;

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
		
		ExceptionTest e=new ExceptionTest();
		//e.exceptionHandle(10, 0);
		//e.uncheckedException();
		e.compareNum(10, 20);

	}
	
	public void exceptionHandle(int x, int y)
	{
		//int s[]= {10,20,30};
		
		//Checked type Exception - Try, Catch and Finally
		try 
		{			
			//p=s[4]/s[2];
			p= x/y;	
			int dp= x/y;
			System.out.println("Divide: " +dp);
		}
		
		catch(Exception e)  //Exception handles all kind of Exception 
		{
			e.printStackTrace();
		}
		
		finally //it executes even there is exception in runtime
		{		
			System.out.println("Hey I'm finally block");
		}
		
		System.out.println("Division is: " +p);
	}
	
	//Unchecked type Exception - Intimation 
	
	public void uncheckedException() throws InterruptedException, FileNotFoundException
	{
		String a= "Hello";
		System.out.println(a);
		Thread.sleep(3000);
		
		String b="How r u?";
		System.out.println(b);
		Thread.sleep(3000);
		
		String c="looks Good";
		System.out.println(c);
		
		File f=new File("C:\\Users\\Anil\\Pictures\\T and K home");
		FileInputStream fin=new FileInputStream(f);
		
	}
	
	//throw exception
	
	public void compareNum(int j, int k)
	{
		if (j<k)
		{
			try
			{
				throw new ArithmeticException();
			}
			
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			
			System.out.println("J is smaller than K");
			
		}
		else
		{
			System.out.println("J is greater than K");
		}
			
		}
	}

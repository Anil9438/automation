package takinginput;

import java.util.Scanner;

public class TakingInputInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TakingInputInJava i=new TakingInputInJava();
		
		Scanner s=new Scanner(System.in);  //constructor
		
		System.out.println("Enter Integer value of p: ");
		int p=s.nextInt();
		
		System.out.println("Enter Integer value of q: ");
		int q=s.nextInt();		
		
		System.out.println("sum of p and q= "+i.take_input(p,q));
		
		System.out.println("Enter the double value for j: ");
		double j=s.nextDouble();
		System.out.println("Square =" +i.double_input(j));
		
		System.out.println("Enter the 1st String: ");
		String s1=s.next();
		
		System.out.println("Enter the 2nd String: ");
		String s2=s.next();
		
		System.out.println("Concatenate: "+ i.concatenate(s1,s2));

	}	
	
	public int take_input(int a, int b)
	{
		return a+b;
	}
	
	public double double_input(double n)
	{
		
		return n*n;
	}
	
	public String concatenate(String l, String m)
	{
		return l+m;
	}
}

package practice;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Anil";
		System.out.println("Original String: " +str);
		
		String str1=str.toUpperCase();
		System.out.println("Uppercase: "+str1);
		
		String str2=str.toLowerCase();
		System.out.println("Lowercase: "+str2);
		
		String a= "Anil";
		String b= "ANIL";
		
		boolean c= a.equals(b);
		System.out.println(c);
		
		boolean d= a.equalsIgnoreCase(b);
		System.out.println(d);
		
		int f= a.compareTo(b);		
		System.out.println(f);
		
		
		Scanner sp=new Scanner(System.in);
		String check="Java is Object Oriented Programing Language";
		System.out.println("String Length: "+ check.length());
		
		System.out.println("Enter the String");		
		String get=sp.next();
		
		System.out.println("Contains: "+check.contains(get));
		
		//String Starts with	
		System.out.println("Enter the String:");
		String n=sp.next();		
		System.out.println("String Starts with: " +check.startsWith(n));
		
		//String Ends with	
		System.out.println("Enter the String:");
		String p=sp.next();		
		System.out.println("String Ends with: " +check.startsWith(p));
		
		System.out.println("Replace: "+ check.replace('O','T'));
		
		String[] dp=check.split(" ");
		for (String sap:dp)
		{
			System.out.println(sap);
		}
		
		String dp1="  Anil Patil  ";
		System.out.println("Trim: "+ dp1.trim());
		
		String dp2="The Alchemists Ark Pvt Ltd";
		char w[] =dp2.toCharArray();
		
		for (char q:w)
		{
			System.out.println(q);
		}

	}
		
		/*StringBuffer str=new StringBuffer("Java");	
		System.out.println("Length: " +str.length());
		System.out.println(str);
		
		str.append("Programming");
		System.out.println("Append: "+str);
		System.out.println("Length: " +str.length());
		
		str.delete(3, 5);
		System.out.println(str);
		System.out.println(str.length());
		
		System.out.println("Reverse: " +str.reverse());*/
		

}

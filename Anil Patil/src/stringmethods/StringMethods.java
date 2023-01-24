package stringmethods;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String as="Hello Dhole Patil";
		
		System.out.println(as);
		System.out.println(as.toUpperCase());
		
		String nk=as.toLowerCase();
		System.out.println(nk);
		System.out.println(as);
		
		String original="Anil";
		String compare="anil";
		
		boolean dp=original.equals(compare);
		System.out.println(dp);		
		boolean sp=original.equalsIgnoreCase(compare);
		System.out.println(sp);
		
		int p=original.compareTo(compare);
		System.out.println("value of Integer p:" +p);
		
		char a='a';
		char A='A';
		System.out.println((int)a);
		System.out.println((int)A);
		
		Scanner s=new Scanner(System.in);
		String check="Hello I am James Gosling Canadian Computer Scientist";
		
		System.out.println(check);
		System.out.println("String Length: "+check.length());
		
		System.out.println("Enter String to Search");
		String d=s.next();
		
		System.out.println("Contains: "+check.contains(d));
		

		System.out.println("Enter the Starts with String");
		String q=s.next();
		System.out.println("Starts With: "+check.startsWith(q));
		
		System.out.println("Enter Ends With String:");
		String l=s.next();
		System.out.println("Ends With:" + check.endsWith(l));

	}

}

package Operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 55, b = 48;
		int c = 44, d = 56;
		String j="Suvarna", s="Dhole";

		int x = (a > b) ? c : d; // True Condition
		System.out.println("---Ternary Operations Result---");
		System.out.println("Value of x:" + x);

		int y = (a < b) ? c : d; // False Condition
		System.out.println("Value of y:" + y);

		char z = (a < b) ? 'g' : 'h';
		System.out.println("Value of z:" + z);

		boolean p = (a > b) ? true : false;
		System.out.println("Value of p:" + p);
		
		String q= (j==s) ? "Anil":"Patil";
		
		System.out.println("Value of q: "+q);

	}

}

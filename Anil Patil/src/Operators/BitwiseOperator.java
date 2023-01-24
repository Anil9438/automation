package Operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Bitwise Operator

		int a=16,b=51,c;

		//"AND Operator" (When All input is 1 then output is 1 otherwise 0)
		c=a & b;
		System.out.println("-----Bitwise Operations result-----");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a & b (AND):"+c);

		//"OR Operator" (When All input is 0 then output is 0 otherwise 1)
		c=a | b;
		System.out.println("a | b (OR):"+c);

		//"XOR Operator" (When All input are same then output is 0 otherwise 1)
		c=a ^ b;
		System.out.println("a ^ b (XOR):"+c);

	}

}

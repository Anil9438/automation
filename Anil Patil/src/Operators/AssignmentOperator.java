package Operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 45; // Assignment Operator

		x += 23; // x=x+23
		System.out.println("---Assignment Operation Result---");
		System.out.println("Value of x=" + x);

		int a = 6, b = 20;

		a += b; // a=a+b;
		System.out.println("Value of a=" + a);

		b *= a; // b=b*a;
		System.out.println("Value of b=" + b);

		int p = 20, q = 25;

		p >>= 2; // p=p>>2;
		System.out.println("Value of p:" + p);

		q <<= 4; // q=q<<4;
		System.out.println("Value of q:" + q);

	}

}

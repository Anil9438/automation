package Operators;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Unary Operator

		int p = 55;
		p++;  //p=p+1
		System.out.println("---Unary Operator---");
		System.out.println("value of p:" + p);
		System.out.println();

		int x = 45, y = 55, z, d;

		z = x--; // postfix  z=x; x=x-1;
		System.out.println("---Postfix---");
		System.out.println("value of z:" + z);
		System.out.println("value of x:" + x);
		System.out.println();

		d = --y; // prefix  y=y-1; d=y;
		System.out.println("---Prefix---");
		System.out.println("value of d:" + d);
		System.out.println("value of y:" + y);

	}

}

package Operators;

public class ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// shift Operator

		int l = 20, m = 44, n;

		n = l >> 2; // Right Shift
		System.out.println("---Shift Operation Result---");
		System.out.println("L=" + l);
		System.out.println("L=" + m);
		System.out.println("L- Right Shift by Two:" + n);

		n = m << 3; // Left Shift
		System.out.println("M- Left Shift by Three:" + n);

	}

}

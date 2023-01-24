package arraysinjava;

public class ArraysInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArraysInJava p = new ArraysInJava(); // p is object
		p.one_dimensional_array();
		p.two_dimensional_array();

	}

	public void one_dimensional_array() // One Dimensional Array

	{

		int s[] = new int[4]; // declaration of array
		s[0] = 44;
		s[1] = 67;
		s[2] = 88;
		s[3] = 99;
		System.out.println(s[3]); // here array size is 5 but entered only 4 values @ 5th place takes '0' value

		int a[] = { 34, 62, 44, 78 };
		System.out.println(a[3]);
		System.out.println("Length of 1D Array: " + a.length); // it shows rows

		for (int i = 0; i < a.length; i++) {
			System.out.println("Value of array " + a[i]);
		}

		System.out.println("For Each Version of For Loop");
		for (int z : s) {
			System.out.println(z);
		}

		char l[] = { 'a', 's', 'k', 'n', 'p', 'd' };
		System.out.println("Array with Character Type");
		System.out.println(l[0]);
		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
		}
		for (char p : l) {
			System.out.println(p);
		}

	}

	public void two_dimensional_array() // Two Dimensional Array

	{

		int k[][] = new int[3][3];
		k[0][0] = 11;
		k[0][1] = 11;
		k[0][2] = 11;
		k[1][0] = 11;
		k[1][1] = 11;
		k[1][2] = 11;
		k[2][0] = 11;
		k[2][1] = 11;
		k[2][2] = 11;

		System.out.println("---Two Dimensional Array---");

		System.out.println(k[0][2]);

		int r[][] = { { 11, 22, 33 }, { 44, 55, 66 } };
		System.out.println(r[1][0]);
		System.out.println("Length of 2D Array: " + r.length); // it shows rows
	}

}

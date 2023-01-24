package methodwithparameter;

public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p = 55, q = 56;
		int a = 46, b = 78, c = 98;
		display();
		sum(p, q); // p and q values should be integer and need to mention
		display(); // you can reuse function repeatedly

		TestMethod tm = new TestMethod(); // Object
		tm.divide();
		tm.average(a, b, c);
		tm.average(25, 30, 55);

	}

	public static void display() // Static Display Method

	{

		System.out.println("*----Student Information----*");
		System.out.println("Name: Anil Patil");
		System.out.println("Branch: EnTc");
		System.out.println("Year: Final");
		System.out.println("Gender: Male");
		System.out.println("Address: Pune");
	}

	public static void sum(int p, int q) // Static Sum Method

	{
		int r = p + q;
		System.out.println("sum:" + r);

	}

	public void divide() // Non-Static Divide Method

	{
		int a = 65, b = 5, c;
		c = a / b;
		System.out.println("Divide:" + c);

	}

	public void average(int a, int b, int c) // Non-Static Average Method

	{

		int avg = (a + b + c) / 3;
		System.out.println("Average:" + avg);
	}

}

package methodwithparameter;

public class TestMethod2 {
	static int x=67;
	int z=55;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(45,55);
		System.out.println("value of x="+x);
		
		TestMethod2 tm2=new TestMethod2(); //object
		tm2.divide();
		System.out.println("value of z="+tm2.z);

	}

	public static void sum(int p, int q)

	{
		int r = p + q;
		System.out.println("sum:" + r);

	}

	public void divide()

	{
		int a = 65, b = 5, c;
		c = a / b;
		System.out.println("Divide:" + c);

	}

	public void average(int a, int b, int c)

	{

		int avg = (a + b + c) / 3;
		System.out.println("Average:" + avg);
	}
	
	public static void display()

	{

		System.out.println("*----Student Information----*");
		System.out.println("Name: Anil Patil");
		System.out.println("Branch: EnTc");
		System.out.println("Year: Final");
		System.out.println("Gender: Male");
		System.out.println("Address: Pune");
	}

}

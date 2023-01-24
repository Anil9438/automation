package methodwithparameter;

public class Anil {

	int n ; // class variable
	static int count = 0; //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anil a1 = new Anil();
		a1.display_n_classvariable();
		a1.display_n_localvariable();
		System.out.println("Value of n in Main:" + a1.n);

		Anil a2 = new Anil();
		a2.display_staticvaribale();
		System.out.println("Count="+count);

	}

	public void display_staticvaribale() 
	{
		count++;
	}

	public void display_n_classvariable()

	{

		int x = 50, y = 150;
		n = x + y;
		System.out.println("Value of n in Class Display=" + n);

	}

	public void display_n_localvariable()

	{

		int x = 150, y = 50;
		int n = x / y;
		System.out.println("Value of n in Local Display=" + n);

	}
}

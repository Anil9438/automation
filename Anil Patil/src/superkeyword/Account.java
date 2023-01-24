package superkeyword;

public class Account extends Employee{
	
	int emp_sal;
	String emp_city;
	
	public Account()  // Default Constructor
	{
		super(22458);
		emp_city="Nagpur";
		emp_sal=95000;
	}
	
	//it will call default constructor parent as we have not given call to the parent class constructor
	public Account(int emp_sal, String emp_city) // Parameterized Constructor
	{
		this.emp_sal=emp_sal;
		this.emp_city=emp_city;
	}
	
	public void emp_info() // Method without Parameter
	{
		
		System.out.println("Emp_id :"+emp_id);
		System.out.println("emp_sal :"+emp_sal);
		System.out.println("emp_city :"+emp_city);
		super.emp_info();
	}
	public void addition(int x, double y) // Method with Parameter
	{
		System.out.println("Addition X and Y");
	}
	public static void main(String[] args) {  
		Account a1=new Account();
		a1.emp_info();
		a1.emp_designation();

		
		Account a2=new Account(55000, "Solapur");
		a2.emp_info();
	}

}
package overriding;

public class Account extends Employee {	
	
	int emp_sal;
	String emp_city;
	String emp_name;
	
	public Account()
	{
		emp_sal=65000;
		emp_city="Pune";
		emp_name="Anil Patil";
	}

	public void emp_info()  //Same method in Parent Class "Employee" (It's called Method Overriding)
	{
		System.out.println("Employee Name: "+emp_name);
		System.out.println("Employee ID: "+emp_id);
		System.out.println("Employee Salary: "+emp_sal);
		System.out.println("Employee City: "+emp_city);
	}
	
	public static void main (String [] args)
	{
		//Account a=new Account(); // Child object created
		//a.emp_info();
		
		//Employee e=new Employee();  // Parent object created
		//e.emp_info();
		
		Employee dp=new Account(); // Reference= Parent and Object= Child
		dp.emp_info();
				
	}
}

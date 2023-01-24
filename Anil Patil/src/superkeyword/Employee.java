package superkeyword;

public class Employee {
	
	int emp_id;
	
	public Employee()  // Default Constructor
	{
		emp_id=40425;
	}
	
	public Employee(int emp_id)  // Parameterized Constructor
	{
		this.emp_id=emp_id;
	}
	
	public void emp_info() // Method 1
	{
		System.out.println("Parent Class Employee ID : "+emp_id);
	}	
	
	public void emp_designation() // Method 2
	{
		System.out.println("Emp Designation : Jr. QA");
	}

}
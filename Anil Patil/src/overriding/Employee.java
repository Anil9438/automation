package overriding;

public class Employee {
	
	int emp_id;
	
	public Employee() //Default Constructor
	{
		emp_id=2022;
	}
	
	public void emp_info() //Same method in Child Class "Account" (It's called Method Overriding)
	{
		System.out.println("Parent Class Employee ID: "+emp_id);
	}

}
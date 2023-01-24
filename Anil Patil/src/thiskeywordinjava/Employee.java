package thiskeywordinjava;

//calling the constructor using this keyword
public class Employee {

	int emp_id;
	int emp_salary;
	String emp_city;
	String emp_name;
	
public static void main(String[] args) {
				
		Employee e1=new Employee();
		e1.show();
		
		//Employee e2=new Employee("Akkalkot",48525,60000, "Kavya Patil");
		//e2.show();
	}
	
	public Employee()
	{
		this("Solapur",14275,60000,"Anil Patil");	//call to parameterised constructor
		emp_id=19125;
		emp_salary=25000;
		emp_city="Pune";
		emp_name="Suvarna Patil";
		this.show();
	}
	
	public Employee(String emp_city, int emp_id, int emp_salary, String emp_name)
	{
		//this();					//call to default constructor
		this.emp_id=emp_id;
		this.emp_salary=emp_salary;
		this.emp_city=emp_city;
		this.emp_name=emp_name;
		this.show();
	}

	public void show()
	{
		System.out.println("Emp ID :"+emp_id);
		System.out.println("Emp City :"+emp_city);
		System.out.println("Emp Salary :"+emp_salary);
		System.out.println("Emp Full Name :"+emp_name);
	}
}
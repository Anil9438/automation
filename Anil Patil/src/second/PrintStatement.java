package second;

public class PrintStatement {

		//Class Variable - Declared inside a class
		String emp_dept="IT";
	
		//Static Variable
		static String emp_city="Pune";
		
public static void main(String[] args) {
		
		//local variables - which are declared inside function 
		//and the scope is upto the closing of function
		
		//***********Print Statement*************

		int x=55; //Declaration and Initialization
		int y=78;
		int z=90;

		System.out.println(emp_city);
		//System.out.println(emp_dept);
		
		
		System.out.println (x); //"println" means - prints the "x" variable value and cursor moves to the "next" line
		System.out.println(y);
		System.out.println(z);

		System.out.print(x); //"print" means - prints the "x" variable value and cursor will be at the "same" line
		System.out.print(y);
		System.out.print(z);
		
		System.out.println(x);
		System.out.println(y);
		System.out.print(z);
		
		System.out.println(x);
		System.out.print(y);
		System.out.println(z);
		
		System.out.println(x+y+z); //it will do addition
		System.out.println(x+y-z); //it will do x+y addition and z will be subtract
		System.out.println(x+" "+y+" "+z); //it will show space in between x,y and z
		System.out.println(x+","+y+","+z); //it will show "," in between x,y and z
		

		System.out.print("Hello");
		System.out.println("Java Developer");

		System.out.print("Hello"+"\n"); //"\n" says to compiler give the space and move the cursor to next line & in this case "\n" will not print on console
		System.out.println("Java Developer");

		System.out.println("Hello"+"\n"); //println and "\n" says to compiler to move the cursor to 2nd line
		System.out.println("Java Developer");
		
		System.out.println("Hello"+"\n\n\n"); //println and "\n" says to compiler to move the cursor to 2nd line
		System.out.print("Java Developer");

	}

}

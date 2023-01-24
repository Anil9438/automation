package interfaceinjava;

public class Demo extends Employee implements Abc, Xyz{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calling methods by passing reference of interface
		Abc s=new Demo();
		s.show();
		s.getData();
		s.sameMethod();
		
		// calling methods by passing reference of interface
		Xyz p=new Demo();
		p.sameMethod();
		System.out.println("Emp_Id: " +p.getID());
		System.out.println("Emp_Name: " +p.getName());
		
		Abc.get();		//calling static method of interface
		
		
		//Calling the methods Using Demo Object
		/*Demo d1=new Demo();
		d1.show();
		d1.getData();
		System.out.println("Emp_ID: "+d1.getID());
		System.out.println("Emp_Name: "+d1.getName());*/
	}

	@Override
	public void getData() {
		// Abc Interface Method
		System.out.println("Value of a : "+a);
	}

	@Override
	public void show() {
		// Employee Class and Abc Interface Methods
		super.show();
		System.out.println("Value of a : "+a);
		System.out.println("Value of dp (Abc) : "+Abc.dp);
	}

	@Override
	public int getID() {
		// Xyz Interface Method
		System.out.println("Value of dp (Xyz) : "+Xyz.dp);
		return 7887;
	}

	@Override
	public String getName() {
		// Xyz Interface Method
		return "Anil Patil";
	}

	@Override
	public void sameMethod() {
		// Abce and Xyz Interface Method
		System.out.println("Inside Demo Class");
	}
	
}

package inheritanceinjava.singleinheritance;

//single inheritance -- there is one parent and one child class
public class Xyz extends Abc {

    int x=10, y=30;
	
	public void single_inheritance_x()
	{
		System.out.println("Child Class Xyz Method");
	}

	Xyz()
	{
		System.out.println("Child Class Xyz Constructor");
		System.out.println("Value of x: " +x);
		System.out.println("Value of x: " +y);
		System.out.println("Value of a: " +a);
		System.out.println("Value of b: " +b);
	}
	
	public static void main (String [] args) {
		
		Xyz p=new Xyz();
		p.single_inheritance_x();
		p.single_inheritance_a();

	}
}

package inheritanceinjava.hierarchicalinheritance;

public class C extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c1=new C(40.45);
		c1.test_a();
		c1.test_c(44.5f, 30.334);
	}

	public C(double c)
	{
		System.out.println("Double c= " +c);
	}
	
	public void test_c(float m, double n)
	{
		System.out.println("Value of float m= "+m+" "+"and "+ "Value of double n= "+n);
	}
	
}

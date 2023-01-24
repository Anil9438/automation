package inheritanceinjava.multilevelinheritance;

//multilevel inheritance
public class C extends B{
	
	public C()
	{
		System.out.println("Class C Constructor");
	}
	
	public void test_C(String p)
	{
		System.out.println("Class C Method : "+p);
	}
	
	
	public static void main(String[] args) {
		
		C c1=new C();
		c1.test_C("A");
		c1.test_B(78.09);
		c1.test_A(25);
	}

}
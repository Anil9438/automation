package inheritanceinjava.hierarchicalinheritance;

public class B extends A {
	
	public B(boolean c)
	{
		System.out.println("Boolean c= " +c);
	}
	
	public void test_b(int p, int q)
	{
		p=11; q=43;
		System.out.println("Value of Class B Variable p= "+p+" "+"and q= "+q);
	}
	
public static void main(String[] arg)
{
	B b1=new B(false);
	b1.test_a();
	b1.test_b(44, 30);
}
}

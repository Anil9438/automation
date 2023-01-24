package Operators;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		//****** Arithmetic Operators ******// 

		//****** addition ******// 
		int p=50,q=45,r;
		r=p+q;
		System.out.println("Arithmetic Operations Result:");
		System.out.println("1.Addition is(r):"+" "+r);
		System.out.println();
		
		//****** Subtraction ******// 
		double l=89.684,m=48.535,n;
		n=l-m;
		System.out.println("2.Substraction is(n):"+" "+n);
		System.out.println();
		
		n=m-l;
		System.out.println("3.Substraction is(n):"+" "+n);
		System.out.println();
		
		//****** Multiplication ******// 
		double s;
		s=l*m;
		System.out.println("4.Multiplication is(s):"+" "+s);
		System.out.println();
		
		//****** Division ******// 
		p=40; //re-initialization
		s=(double)p/q;
		System.out.println("5.Division is(s-double):"+" "+s);
		System.out.println();
		
		float g;
		g=p/q;
		System.out.println("5.1 Division is(g-float without manual):"+" "+g);
		System.out.println();
		
		g=(float)p/q;
		System.out.println("5.2 Division is(g-float with manual):"+" "+g);
		System.out.println();
		
		//****** Modulus ******// 
		int x=56,y=55,z;
		z=x % y;
		System.out.println("6.Modulus is:"+" "+z);
		
		float f=50.10f, c=67.09f;
		
		double k=(double)f/c;
		
		System.out.println("7. Value of k: "+k);
		
	}

}

package practice;

public class Arithmatic {
	
	static int g=50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=55, c;
		c=a*b;
		System.out.println("Multiplication is:"+c);

		double d = (double)a/b;
		System.out.println("Division is:"+d);
		
		float p;
		a=67;
		p=(float)b/a;
		System.out.println(p);
		
		//Shift Operator
		int e=50;
		//e=50>>2;
		e>>=2;
		System.out.println("E Right Shift by 2: "+e);
		
		int j=g+a;
		System.out.println("Value of J:"+j);

	}
	

}

package practice;

public class Interface implements FirstInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstInterface fi=new Interface();
		fi.sum();
		fi.multiply();		

	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
		System.out.println("Sum: "+(a+b));
		
	}

	@Override
	public int multiply() {
		// TODO Auto-generated method stub
		System.out.println("Multiplication:"+(a*b));
		return a*b;
	}

}

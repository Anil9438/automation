package decisionmakingstatement;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If Statement
		
		int a=78, b=98;
		int c=55, d=100;
		
		if (a<b) //condition is true 
		{
			System.out.println("---If Statement---");
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("b is greater than a");
			System.out.println();
		}
		
		if ((a%2)==0) //Check number is even or not by using modulus and remainder must be Zero
		{
			System.out.println("a is even number:"+a);
		}
		
		if (a<=b)
		{
			System.out.println("a is smaller than b");
		}
		
		if (c==d) //condition is false so it's not executed
		{
			System.out.println("---If Statement---");
			System.out.println("c="+c);
			System.out.println("d="+d);
			System.out.println("c is smaller than d");
			System.out.println();
		}
		
		if (c!=d) //condition is true
		{
			System.out.println("c="+c);
			System.out.println("d="+d);
			System.out.println("c is not equal to d");
		}
			
	}

}

package Operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Logical Operator

		boolean x=true,y=false,z;

		z=x && y;
		
		System.out.println("---Logical Operations Result---");
		System.out.println("x && y:"+z);

		z= x || y;

		System.out.println("x||y:"+z);
		
		int a=45, b=76, c=44;

		z=(a<b) && (a<c);

		System.out.println("x && y:"+z);
		

	}

}

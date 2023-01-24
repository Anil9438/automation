package Operators;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Relational Operator - It's result is in the boolean form means true/false only

		int l=34, m=34;
		boolean n;

		n=l<m;
		System.out.println("----Relational Operations Result----");
		System.out.println("l="+l+","+"m="+m);
		System.out.println("l<m:"+n);
		//Result-False

		n=l>m;
		System.out.println("l>m:"+n);
		//Result-False

		n=l<=m;
		System.out.println("l<=m:"+n);
		//Result-True

		n=l>=m;
		System.out.println("l>=m:"+n);
		//Result-True

		n=l==m;
		System.out.println("l==m:"+n);
		//Result-True

		n=l!=m;
		System.out.println("l!=m:"+n);
		//Result-False
	}

}

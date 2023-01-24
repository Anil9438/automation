package practice;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array a=new Array();
		a.oneDimensional();

	}
	
	public void oneDimensional()
	{
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println("One Dimensional Array: "+a[3]);
		
		System.out.println("Array s value: "+a.length);
		
		for (int i=0; i<a.length;i++)
		{
			System.out.println("Array Values: "+a[i]);
		}
		
		for (int c:a) //For each version of For loop
		{
			System.out.println("A Array values: "+c);
		}
		
		//Two Dimensional
		
		int sp[][]= {{10,20,30},{40,50,60}};
		
		for (int i=0; i<sp.length; i++) //For Row
		{
			for (int j=0; j<3; j++) //For Column
			{
				System.out.println("Two Dim Array Values: "+sp[i][j]);
			}
		}
	}

}

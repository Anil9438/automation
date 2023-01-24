package overloading.constructor;

public class Test {
	
	int x,y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1=new Test();
		t1.disp();
		
		Test t2=new Test(30, 40);
		t2.disp();

	}

	public Test()
	{
		x=15;
		y=55;
	}
	
	public Test(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void disp()
	{
		System.out.println("value of x: "+x+"Value of y: "+y);
	}
}

package overloading.constructor;

//constructor overloading
public class TestConstructor {

	int x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestConstructor ts1=new TestConstructor();
		ts1.show();
		
		TestConstructor ts2=new TestConstructor(12, 55);
		ts2.show();
	}
	
	public TestConstructor()
	{
		x=75;
		y=58;
	}
	
	public TestConstructor(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void show()
	{
		System.out.println("value of x : "+x+" y :"+y);
	}
}
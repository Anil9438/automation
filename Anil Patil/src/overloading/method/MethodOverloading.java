package overloading.method;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading m1=new MethodOverloading();
		m1.getData();
		m1.getData(57);
		m1.getData(34.34f);
		m1.getData(78.2545);
		m1.getData("Anil");
	}
	
	public void getData()
	{
		System.out.println("inside getdata method no parameter");
	}
	
	public void getData(int x)
	{
		System.out.println("inside getdata method : value of int x:"+x);
	}
	
	public void getData(String x)
	{
		System.out.println("inside getdata method : value of int x: "+x);
	}
	
	public void getData(float w)
	{
		System.out.println("inside getdata method : value of float w:"+w);
	}
	
	public void getData(double y)
	{
		System.out.println("inside getdata method : value of double y:"+y);
	}

}

package abstractclass;

public abstract class Shape {
	
	int p;
	public Shape()
	{
		p=20;
	}
	
	public abstract double area();
	public abstract int perimeter();
	
	public void show()
	{
		System.out.println("Inside show method of Shape Class");
	}
}
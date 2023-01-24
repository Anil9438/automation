package abstractclass;

public class Circle extends Shape{

	int r;
	public Circle(int r)
	{
		this.r=r;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		
		//return Math.PI*Math.pow(r, 2);
		System.out.println("Value of p : "+p);
		return Math.PI*r*r;
	}
	
	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(5);
		System.out.println("Area of Circle : "+c.area());
		c.show();
		
	}
	
	
}


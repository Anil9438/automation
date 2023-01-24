package thiskeywordinjava;

//passing this as parameter to constructor
public class A {

	int x, y;

	public A() 
	{
		x = 45;
		y = 59;
		B b1 = new B(this);
	}
}
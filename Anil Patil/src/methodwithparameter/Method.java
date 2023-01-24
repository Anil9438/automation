package methodwithparameter;

//Doing Practice not part of class*** 

public class Method{

	int count=50;
	static int s=45;	
	int k;
	int n;

public static void main (String [] args){

	Method p=new Method();
	p.sum(45.55, 50.50);
	p.average(30,40,50);
	A();
	
	System.out.println("Static varibale s: "+s);
	System.out.println("Non-Static varibale count: "+p.count);
	System.out.println("k:" +p.k);
	System.out.println("n: "+p.n);

}

public Method()
{
	k=100;
	n=200;
}

public void count()

{
	count++;
	System.out.println("Count: "+count);

}


public static void A()

  {

	System.out.println("Hello, Static Method is running");

  }

public void sum (double a, double b)

  {

	double c= a+b;
	System.out.println("Sum: "+c);

  }

public void average (int d, int e, int f)

  {

	int avg= (d+e+f)/3;
	System.out.println("Average: "+avg);

  }

}

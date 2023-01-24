package finalkeyword;

public class FinalVariable {
	
	double s;
	
	final int p=50;
	
	public void show()
	{
		int a=p*5; //Can access final variable
		//p=20;	  //Can't assign value to final variable	
		System.out.println("Value of p: "+p);
		System.out.println("Value of a: "+a);
	}
	
	public final void disp()
	{
		System.out.println("Inside Final Disp Method");
	}
	
public static void main(String[] args)
{
	FinalVariable fv=new FinalVariable();
	fv.show();
	fv.disp();
	
}

}

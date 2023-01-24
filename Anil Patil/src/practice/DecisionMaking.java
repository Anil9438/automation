package practice;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int grade=35;
	
	if (grade>=75)
	{
		System.out.println("Distinction");
	}
	else if (grade>=60)
	{
		System.out.println("First Class");
	}
	else if (grade>=50)
	{
		System.out.println("Second Class");
	}
	else if(grade>=40)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}

}
}

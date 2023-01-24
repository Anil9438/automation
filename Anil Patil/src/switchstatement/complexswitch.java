package switchstatement;

public class complexswitch {

	public static void main(String[] args) {
		// Complex Switch Statement

		complexswitch c = new complexswitch();
		c.switch_test_integer(77);

	}

	public void switch_test_integer(int grade) 
	
	{
		int g = grade / 10;
		
		switch (g) 		
		{
		case 10:
		case 9:
		case 8:
			System.out.println("Distinction");
			break;
		case 6:
			System.out.println("First Class");
			break;
		case 5:
			System.out.println("Second Class");
			break;
		case 4:
			System.out.println("Pass");
			break;
		default:
			if (grade >= 75) 
			{
				System.out.println("Distinction");
			}
			else if (grade < 75 && g == 7) 
			{
				System.out.println("First Class");
			} 
			else 
			{
				System.out.println("Fail");
			}
			break;
		}
	}

}

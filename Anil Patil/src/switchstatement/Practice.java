package switchstatement;

public class Practice {

	public static void main(String[] args) {

		Practice n=new Practice();
		n.Switch(55);

	}

public void Switch(int grade)
	{
		int g= grade/10;
		switch(g) {
			case 10:
			case 9:
			case 8:
				System.out.println("Distinction");
				break;
			case 6:
				System.out.println("First");
				break;
			case 5:
				System.out.println("Second");
				break;
			case 4:
				System.out.println("Pass");
				break;
			default:
				if (grade>=75)
				{
					System.out.println("Distinction");
				}
				else if (grade<75 & g==7)
				{
					System.out.println("First Class");
				}
				else
				{
					System.out.println("Fail");
				}

	}

	}
}
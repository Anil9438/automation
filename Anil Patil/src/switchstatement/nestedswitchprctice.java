package switchstatement;

public class nestedswitchprctice {

	public static void main(String[] args) {

		nestedswitchprctice ns = new nestedswitchprctice();
		ns.nested_switch(3, 1);

	}

	public void nested_switch(int o, int i)

	{

		switch (o)

		{

		case 1:
			System.out.println("EnTc");

			switch (i)

			{

			case 1:
				System.out.println("FY EnTc");
				break;
			case 2:
				System.out.println("SY EnTc");
				break;
			case 3:
				System.out.println("TY EnTc");
				break;
			default:
				System.out.println("No Admission Available");

			}
			break;

		case 2:
			System.out.println("IT");

			switch (i)

			{

			case 1:
				System.out.println("FY IT");
				break;
			case 2:
				System.out.println("SY IT");
				break;
			case 3:
				System.out.println("TY IT");
				break;
			default:
				System.out.println("No Admission Available");

			}
			break;

		case 3:
			System.out.println("Computer");

			switch (i)

			{

			case 1:
				System.out.println("FY Computer");
				break;
			case 2:
				System.out.println("SY Computer");
				break;
			case 3:
				System.out.println("TY Computer");
				break;
			default:
				System.out.println("No Admission Available");

			}
			break;

		default:
			System.out.println("No Department Found");
		}

	}
}

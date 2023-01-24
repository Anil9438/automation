package decisionmakingstatement;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Else If Ladder Statement
		
		int k=230;

		if (k>=300)

			{
				System.out.println("Location is: Akkalkot"+" "+k+"km from Ravet");
			}

		else if (k>=250)

			{
				System.out.println("Location is: Solapur"+" "+k+"km from Ravet");
			}
		else if (k>=150)

			{
				System.out.println("Location is: Indapur"+" "+k+"km from Ravet");
			}
		else if (k>=4)

			{
				System.out.println("Location is: Pune"+" "+k+"km from Ravet");
			}
		else

			{
				System.out.println("Location is: Ravet"+" "+k+"km from Ravet");
			}
	}

}

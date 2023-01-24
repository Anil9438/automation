package loopsinjava;

public class InnerForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerForLoop in = new InnerForLoop();
		//in.inner_for_loop();
		in.two_dmensional_array();
	}

	public void inner_for_loop()

	{
		for (int i = 0; i < 5; i++) // Outer For Loop
		{
			for (int j = 0; j < 2; j++) // Inner For Loop
			{
				System.out.println("value of i = " + i + " and j =" + j);
			}
		}
	}

	public void two_dmensional_array()

	{
		int p[][] = { { 22, 33, 44 }, { 55, 66, 77 } };
		for (int i = 0; i < p.length; i++) // For Row
		{
			for (int j = 0; j < 3; j++) // For Column
			{
				System.out.println(p[i][j]);
			}
		}
	}

}

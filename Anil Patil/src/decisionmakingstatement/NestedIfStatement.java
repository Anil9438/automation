package decisionmakingstatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nested If Statement

		int p = 55, q = 89;

		if (p == 55) {
			if (q == 89) {
				System.out.println("value of p & q =" + " " + p + " " + "&" + " " + q);
			}
		}

		else {
			System.out.println("Outer Condition False and not executed");
		}

	}

}

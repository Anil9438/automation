package returntypeinjava;

public class ReturnTypeInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypeInJava p = new ReturnTypeInJava();
		p.return_nothing();

		int x = p.return_integer(26, 34);
		System.out.println("Result of Integer Method: " + x);

		p.return_float();
		System.out.println("Result of Float Method: " + p.return_float());

		p.return_boolean();
		System.out.println("Result of boolean Method: " + p.return_boolean());
		
		char[] g=p.return_char();
		for (int i=0;i<g.length;i++)
		{
			System.out.println(g[i]);
		}
		
		for(char f:g)
		{
			System.out.println(f);
		}
	}

	public void return_nothing() {
		System.out.println("No Return");
	}

	public int return_integer(int a, int b) {
		return (a + b);
	}

	public float return_float() {
		return 77.89f * 89.55f;
	}

	public boolean return_boolean() {
		int a = 67, b = 89;
		return (a < b);
	}
	
	public char[] return_char(){
		char j[] = {'w','e','l','c','o','m','e'};
		return j;
	}

}

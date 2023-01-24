package loopsinjava;

public class ForLoopForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ForLoopForArray a = new ForLoopForArray();

		a.search_array(67);
	}

	public void search_array(int num)

	{
		int x[] = { 34, 56, 67, 156, 657, 890, 987 };
		int f = 0;
		int i=0;
		for (i = 0; i < x.length; i++) {
			if (x[i] == num) {
				f = 1;
				break;
			}
		}
		if (f == 1) {
			System.out.println("number found at location: " + i);
		} else {
			System.out.println("number not found");
		}
	}
}
package interfaceinjava;

public interface Abc {
	
	int a=44; // Variable must be Initialized with some value and can't change
	int dp=200;
	public void getData(); // Methods are declared so body not present
	public void show();
	public void sameMethod();
	
	public static void get()
	{
		System.out.println("Abc Interface - Get Method");
	}
}

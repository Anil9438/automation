package practice;

//Enum is predefined set of data

public class EnumTest {
	
	enum Name {Anil, Sunil, Sanjeev, Ravi, Anu, Suvarna, Kavya, Navya};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnumTest et=new EnumTest();
		et.useEnum();

	}
	
	public void useEnum()
	{
		Name n=Name.Kavya;
		
		switch(n)
		{
		case Anil:
		case Kavya:
			System.out.println("Name is Anil/Kavya");
			break;
			
		case Suvarna:
			System.out.println("Name is Suvarna");
			break;
			
		default:
			System.out.println("Name is not found");				
				
		}
		
		for (Name x: Name.values())
		{
			System.out.println(x);
		}
	}

}

package practice;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwitchStatement ss=new SwitchStatement();
		ss.switch_Statement(5);

	}
	
	public void switch_Statement(int choice)
	{
		switch(choice)
		{
		
		case 1:
			System.out.println("Case 1");
			break;
			
		case 2:
			System.out.println("Case 2");
			break;
			
		case 3:
			System.out.println("Case 3");
			break;
			
		default:
			System.out.println("Default");				
		
		}
	}

}

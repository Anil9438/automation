package abstractclass;

public class organization extends employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		organization org=new organization();
		org.display();
		org.getData();

	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		
		System.out.println("Get Data Method of Employee Class");
		
	}

}

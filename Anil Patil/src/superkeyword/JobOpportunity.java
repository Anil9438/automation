package superkeyword;

public class JobOpportunity extends Account{
	
	String jd;
	public JobOpportunity() {
		// TODO Auto-generated constructor stub
		jd="Needed a passionate Test Engineer";
	}
	
	public void show_info() // Method without Parameter
	{
		System.out.println(jd);
	}
	
	public void show_info(String e) // Method with Parameter
	{
		
	}
	public static void main(String[] args) {
		
		JobOpportunity j=new JobOpportunity();
		j.emp_info();
		j.emp_designation();
		j.show_info();
	}
	
}
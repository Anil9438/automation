package thiskeywordinjava;

//passing this as parameter in method call
public class Company {

	int comp_id;
	String comp_name;
	String comp_city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company p1 = new Company();

	}

	public Company() {
		comp_id = 158722;
		comp_name = "Accenture";
		comp_city = "Pune";
		this.show();
		this.input(this);
	}

	public void input(Company c2) {
		c2.comp_city = "Bengaluru";
		c2.comp_id = 45712;
		c2.comp_name = "Infosys";
		System.out.println(c2.comp_id);
		System.out.println(c2.comp_name);
		System.out.println(c2.comp_city);
	}

	public void show() {
		System.out.println("Company ID :" + comp_id);
		System.out.println("Company City :" + comp_city);
		System.out.println("Company Name :" + comp_name);
	}
}

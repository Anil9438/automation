package encapsulationinjava;

public class B extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		b.setP(30);
		b.setQ(45.55);
		b.setR("Anil Patil");
		b.setS(true);
		
		System.out.println("int p: "+b.getP());
		System.out.println("double q: "+b.getQ());
		System.out.println("String r: "+b.getR());
		System.out.println("Boolean s: "+b.isS());
		
	}

}

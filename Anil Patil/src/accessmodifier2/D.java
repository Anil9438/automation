package accessmodifier2;

//Inherited Class, Other Package

import accessmodifier.A;

public class D extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D d=new D();
		d.getPublic();
		d.getProtected();

	}

}

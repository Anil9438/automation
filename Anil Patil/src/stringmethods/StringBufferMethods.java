package stringmethods;

public class StringBufferMethods {
	
	public void buffer_method()
	{
		StringBuffer sb=new StringBuffer("Anil");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.append("Patil");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.delete(1, 6);
		System.out.println("delete 1,6: "+sb+", "+ "lenght:"+sb.length());
		System.out.println("Reverse: "+sb.reverse());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBufferMethods b=new StringBufferMethods();
		b.buffer_method();

	}

}

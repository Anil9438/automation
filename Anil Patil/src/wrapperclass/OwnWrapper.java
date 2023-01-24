package wrapperclass;

public class OwnWrapper {
	
	int p;
	
	public OwnWrapper()
	{
		
	}
	
	public OwnWrapper(int p)
	{
		this.p=p;
	}
	
	public int getVale()
	{
		return p;
	}
	
	public void setValue(int p)
	{
		this.p=p;
	}
	
	public String toString()
	{
		return Integer.toString(p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OwnWrapper dp=new OwnWrapper(30);
		System.out.println(dp);

	}

}

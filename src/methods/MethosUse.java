package methods;

public class MethosUse {

	public static void main(String[] args) 
	{
		MethosUse mu=new MethosUse();
		mu.a();
		b();
		d(10, 2, "b");
		mu.c(1, 25, "ind");

	}
	public void a()
	{
		System.out.println("this is non static methgod");
	}
	public static void b()
	{
		System.out.println("this is static method ");
	}
	public void c(int runs,int overs,String team)
	{
		System.out.println("non static method with parameter");
		System.out.println("my runs are:"+runs);
	System.out.println("my overs are "+overs);
	System.out.println("my team is"+team);
	}
	public static void d(int floor,int faltno,String buildindname)
	{
		System.out.println("ststic method with parameter");
	System.out.println("my floor no is "+floor);
	System.out.println("my dlatno is "+faltno);
	System.out.println("my buildind name is "+buildindname);
	
	
	}

}

package methods;

public class StaticMethodCallFromSameClass {

	public static void main(String[] args) 
	{


		//how to call static regular method from same class
		//call with only methodname();
		test();//calling static regular method from same class
		test1();//calling static regular method from same class
		

	}
	public static void test()
	{
		System.out.println("hi this is static regular method test");
	}
	public static void test1()
	{
		System.out.println("hi this is static regular method test1");
	}
	
	
	

}

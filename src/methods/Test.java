package methods;

public class Test {

	public static void main(String[] args)//method declaration
	{

		test1();
		Test t=new Test();
		
		t.test2();
		
//method body/method definition
		

	}
	//public static void test();//this is incomplete method
	//only declaration is present, method body or definition is not present

	
	
	public static void test1()
	{
		//this is complete method
		//method have declaration part as well as body or definition
		System.out.println();
	}
	public void test2()
	{
		System.out.println("this is complete method");
	}
}

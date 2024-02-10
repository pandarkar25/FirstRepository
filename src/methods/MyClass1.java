package methods;

public class MyClass1 {

	public static void main(String[] args) {


		//this is example of calling static method from another class
		
		demo1();//static regular complete method from same class
		
		demo2();////static regular complete method from same class
		//calling static method from another class
		//classname.methodname();
		Myclass2.sample1();
		Myclass2.sample2();

	}
	public static void demo1()//static regular complete method
	{
		System.out.println("hi this is demo1 method from myclss1 (same class)");
	}
	public static void demo2()//static regular complete method
	{
		System.out.println("hi this is demo2 method from same class");
	}
	
	
	
	
	
	

}

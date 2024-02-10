package methods;

public class NonStaticMethodFromSameClass {

	public static void main(String[] args) 
	{
	
		//to call non static methods we need object
		//classname objectname=new classname();
		
		NonStaticMethodFromSameClass obj=new NonStaticMethodFromSameClass();
		//how to call non static method
		//syntax-->objectName.methodname();
		obj.test1();//calling non static method from same class
		obj.test2();//calling non static method from same class
	}
	
	public void test1()
	{
		System.out.println("this is non static method from same class");
	}
	public void test2()
	{
		System.out.println("this is non static method from test2");
	}

}

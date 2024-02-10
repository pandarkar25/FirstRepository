package methods;

public class MyClass3 {

	public static void main(String[] args) {
	
		//calling non static methods from same class
		//create object//classname objectname=new classname();
		MyClass3  m3=new MyClass3();
		m3.a();//calling non static method from same class
		m3.b();//calling non static method from same class
		
//to call non static method from another class
//create object of that another class
		Myclass4 m4=new Myclass4();
		m4.c();//calling non static method from another class
		m4.d();

	}
	public void a()
	{
		System.out.println("this is a non static method from myclass3");
	}
	public void b()
	{
		System.out.println("this is non static method from myclass3");
	}
	
	
	
	

}

package variables;

public class Sample1 {
	int a=55;//non static global bariable
	static int b=11;//static global variable
	

	public static void main(String[] args) {

//calling global variable from same class
//if want to call non sataic global variable from same class-->need to create object
		//calling type-->objectname.variable name
		
Sample1 s1=new Sample1();//created object of class
System.out.println("A vlue is"+s1.a);//calling non static global variable from same class

//if we want to call static global variable from same class
//just call by variable name
//calling type-->variablename
System.out.println("b value is"+b);
	}

}

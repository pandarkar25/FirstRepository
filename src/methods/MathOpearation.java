package methods;

public class MathOpearation {

	public static void main(String[] args) 
	{
		MathOpearation mo=new MathOpearation();
		mo.addition();
		int b;
		int a;
		//subtraction(int a,int b);
		mo.subtraction(10,5);
		
	}
	public void addition()//method without parameter
	{
		int a;int b;int sum;
		a=10;
		b=20;
		sum=a+b;
		System.out.println("addition is " +sum);
	}
	public void addition(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("addition is "+sum);
	}
	public  void subtraction(int a,int b)//with parameter
	{
		a=10;
		b=5;
		int sub;
		sub=a-b;
		System.out.println("subtraction is "+sub);
	}
	
	
	
	
	
	
	

}

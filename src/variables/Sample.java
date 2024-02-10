package variables;

public class Sample {
	int a=88;//global variable

	public static void main(String[] args) {
	Sample s=new Sample();
	s.demo1();
	s.demo2();
		

	}
	public void demo1()
	{
		int x=1;//local variable
		int y=2;
		int sum=x+a;
		System.out.println(sum);
	}
	public void demo2()
	{
		int x=90;
		int y=100;
		int sub=x-a;
		System.out.println(sub);
	}
	
	
	
	
	
	
	
	
	
	
	

}

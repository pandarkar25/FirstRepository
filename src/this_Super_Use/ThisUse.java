package this_Super_Use;

public class ThisUse {
	int a=90;//global variable
	int b=100;//global variable
	static int z=1;//static global variable
	

	public static void main(String[] args)
	{
		ThisUse t=new ThisUse();
		t.display();
	}
	public void display()
	{
		int a=10;//local variable
		int b=20;//local variable
		int z=1000;//local variable
		System.out.println(a);//calling local variable
		System.out.println(this.a);//calling globalvariable using this keyword
		System.out.println(b);//calling local variable
		System.out.println(this.b);//calling global variable using this keyword
		System.out.println(z);//calling local variable
		System.out.println(this.z);//calling global variable using this keyword
		
		
		
		
	}

}

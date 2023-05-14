class Outer 
{

	class Inner{
	void m1(){
System.out.println("inner method");
	}
	}
	void m2(){
		Inner e=new Inner();

System.out.println("outer method");
e.m1();
	}
}
 class main1
{


	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Outer o=new Outer();
		o.m2();
	}
}


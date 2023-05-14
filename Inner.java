public class Inner 
{
	public static void m1() 
	{
		System.out.println("Inner hello");
	}
	public class Inner1
	{
		public static void main(String[] args) 
	{
		System.out.println("Hello World! ---inner1");
		Inner.m1();
		Inner i=new Inner();

	}

	}
}


class  Test4 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//Demo d=new Demo();
		itref1 d=new Demo();
		d.m1();
	}
}
interface itref1
{
	public void m1();
}

class Demo implements itref1
{
public void m1(){
	System.out.println("hello demo method m1");
}
}
class Exam1 
{
	
	Exam1()
	{
		System.out.println("Exam 1 constructor");
	}
	Exam1(int a)
	{
		System.out.println("Exam 1  int parem constructor");
	}
	
	public static void main(String[] args){
		Exam1 e1=new Exam1();
		Exam1 e1=new Exam1(10);
	}

}

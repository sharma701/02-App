
public class Exam1 
{
	String name;
	int no;

	public Exam1(String name,int no){
		this.name=name;
		this.no=no;
	}
	
	
	public static void main(String[] args){
		//String str1="ABC";
		String str1=new String("ABC",1);
		String str2=new String("ABC",2);
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));

	}

}

import java.util.Scanner;
class Anand 
{
	public void m1(){
		system.out.println("Hello india");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word");
		String str=sc.next();
		
		StringBuilder sb=new StringBuilder();
	str.chars().distinct().forEach( c -> sb.append((char)c));

         System.out.println(sb);
		 m1();
	}
}
import java.util.Scanner;
class Revl 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		int l=s.length();
		char [] c=s.toCharArray();
		System.out.println(s+":::"+l);
		for(int i=l-1;i>=0;i--){
			System.out.println(c[i]);
	}
	}
}

import java.util.*;
class  StringRevl
{
	public static void main(String[] args) 
	{
		String s="india is a good ";
		char[] t1=s.toCharArray();
		  System.out.println(t1);
		 for (int i=t1.length-1;i>=0;i--)
            System.out.println(t1[i]);
        }

}

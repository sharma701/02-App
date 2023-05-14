import java.util.function.*;
class Test1 
{
	public static void main(String[] args) 
	{
		Function<Integer,Integer> f=i->i*i;
()-> System.out.println("Hello india");

(int a,int b)->System.out.println(a+b):
		System.out.println("multiplication of:"+f.apply(4));
		Predicate<Integer> p=i->i%2==0;
		System.out.println("chek even of not:"+p.test(4));
		System.out.println("chek even of not:"+p.test(5));
	}
}

 final class  Immutabe 
{
	private final int i;

	private Immutabe (int i){
		this.i=i;
	}



	public static void main(String[] args) 
	{
		Immutabe  e=new Immutabe (10);
	
		System.out.println(e.i);
		Immutabe  e1=new Immutabe (15);
		System.out.println(e1.i);
	}
}

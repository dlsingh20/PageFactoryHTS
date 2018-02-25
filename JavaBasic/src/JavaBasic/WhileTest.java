package JavaBasic;
public class WhileTest 
{
	public static void main(String[] args)
	{
		//test();
		test2();
	}
	
	public static void test()
	{
		int table=15;
		int b=1;
		while(b<=10)
		{
			System.out.println(table*b);
			b++;
		}		
	}
	
	public static void test2()
	{
		int a=15;
		int b=1;
		
		do {
			System.out.println(a*b);
			b++;
			
		}while(b<=10);
		
		
	}
	
	
	
	
	
}

public class IfElseExe {

	public static void main(String[] args) {
		IfElseExe obj = new IfElseExe();
		//obj.test();
		//obj.print(17);
		//obj.testWhile();
		obj.testDoWhile();
	}
	
	public void test()
	{
		int i=25;
		int j=25;
		if(i>j)
		{
			int k = i-j;
			System.out.println(k);
		}else if(j>i)
		{
			int k = j-i;
			System.out.println(k);
		}else {
			System.out.println("Both Are equals");
		}
	}
	
	/*
	 Create a method which will accept a int parameter
	 if number is greater than 10 then write a table of that number
	 else print triangle star up to nuber times
	 
	  
	*/
	
	public static void print(int num)
	{
		if(num>10)
		{
			System.out.println("Print Table of "+num);
		}else {
			System.out.println("Print * "+num+" Times");
		}
	}
	
	public static void testWhile()
	{
		int tab=7;
		int i=1;
		
		while(i<=10)
		{
			System.out.println(tab*i);
			i++;
		}
			
	}
	
	public static void testDoWhile()
	{
		int tab=7;
		int i=1;
			do {
					
			//System.out.println(tab*i);
			i++;
		}
		while(i<=10);
			System.out.println(tab*i);	
	}
	
	
}
